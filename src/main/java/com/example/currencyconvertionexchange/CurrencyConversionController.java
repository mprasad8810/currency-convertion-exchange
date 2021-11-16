package com.example.currencyconvertionexchange;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class CurrencyConversionController {


    @GetMapping("/hello")
    public String text(){
        return "hello dfsd";
    }
    @GetMapping("/currency-conversion/{from}/{to}/quantity/{quantity}")
    public CurrencyConversionBean retriveAllData(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){
//        HashMap<String, String> uriVariables = new HashMap<>();
//        uriVariables.put("from", from);
//        uriVariables.put("to", to);
        ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity
                ("http://localhost:8000/currency-exchange/"+from+"/"+to,CurrencyConversionBean.class);
        CurrencyConversionBean currencyconvertion = responseEntity.getBody();
        return new CurrencyConversionBean(currencyconvertion.getId(),from.toUpperCase(),to.toUpperCase(),currencyconvertion.getConvertionmultiple(),
                quantity.multiply(currencyconvertion.getConvertionmultiple()),
                quantity,currencyconvertion.getEnvironment());
    }
}
