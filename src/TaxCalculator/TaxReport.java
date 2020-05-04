package TaxCalculator;

import TaxCalculator.TaxCalculator2018;

public class TaxReport {
    private TaxCalculator calculator;

// Constructor injection
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

// Method injection
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

// Setter injection
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
