package com.tz.mortgage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MortgageResource {

    private final float OUTSTANDING_CAPITAL = 250000f;
    private final float ANNUAL_EQUIVALENT_RATE = 2.1f;
    private final float DAYS_IN_MONTH = 31;
    private final float DAYS_IN_YEAR = 365;


    @RequestMapping(value = "/bank-interest", params = {"outstandingCapital", "annualEquivalentRate", "daysInMonth"})
    public float getBankInterest(@RequestParam(value = "outstandingCapital") float outstandingCapital, @RequestParam(value = "annualEquivalentRate") float annualEquivalentRate, @RequestParam(value = "daysInMonth") float daysInMonth) {
        return outstandingCapital * annualEquivalentRate * daysInMonth / DAYS_IN_YEAR;
    }

}
