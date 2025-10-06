package com.in28minutes.microservices.currency_conversion_services;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calcCurrencyConversion(
            @PathVariable String from, @PathVariable String to,
            @PathVariable BigDecimal qty) {

        return new CurrencyConversion(100L, from, to, qty, BigDecimal.ONE,
                 BigDecimal.ONE, "");
    }
}
