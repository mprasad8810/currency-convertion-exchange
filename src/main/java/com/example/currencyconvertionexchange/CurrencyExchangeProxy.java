package com.example.currencyconvertionexchange;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange-service",url = "localhost:8000")
@FeignClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/{from}/{to}")
    public CurrencyConversionBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
