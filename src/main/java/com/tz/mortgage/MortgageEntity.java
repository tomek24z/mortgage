package com.tz.mortgage;

public class MortgageEntity {

    private final float totalCapital;
    private final float annualEquivalentRate;

    public MortgageEntity(float totalCapital, float annualEquivalentRate) {
        this.totalCapital = totalCapital;
        this.annualEquivalentRate = annualEquivalentRate;
    }
}
