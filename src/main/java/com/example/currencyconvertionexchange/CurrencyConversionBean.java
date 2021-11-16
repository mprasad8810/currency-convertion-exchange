package com.example.currencyconvertionexchange;

import java.math.BigDecimal;

public class CurrencyConversionBean {

    private Long id;
    private String from;
    private String to;
    private BigDecimal convertionmultiple;
    private BigDecimal totalquantity;
    private BigDecimal quantity;
    private String environment;

    public CurrencyConversionBean() { }

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal convertionmultiple, BigDecimal totalquantity, BigDecimal quantity, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convertionmultiple = convertionmultiple;
        this.totalquantity = totalquantity;
        this.quantity = quantity;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConvertionmultiple() {
        return convertionmultiple;
    }

    public void setConvertionmultiple(BigDecimal convertionmultiple) {
        this.convertionmultiple = convertionmultiple;
    }

    public BigDecimal getTotalquantity() {
        return totalquantity;
    }

    public void setTotalquantity(BigDecimal totalquantity) {
        this.totalquantity = totalquantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
