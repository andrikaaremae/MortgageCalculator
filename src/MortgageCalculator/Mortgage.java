package MortgageCalculator;

import static MortgageCalculator.Console.readNumber;

public class Mortgage {

    int principal;
    float annualInterest;
    byte years;

    public Mortgage (int principal, float annualInterest, byte years){
        setPrincipal(principal);
        setAnnualInterest(annualInterest);
        setYears(years);
    }

    public Mortgage () {
        this(0, 0, (byte) 0);
    }

    private void setYears(byte years) {
        this.years = (byte) readNumber("Period (Years): ", 1, 30);
    }

    public byte getYears() { return years; }

    private void setAnnualInterest(float annualInterest) {
        this.annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
    }

    private void setPrincipal(int principal) {
        this.principal = (int) readNumber("Principal: ", 1000, 1_000_000);
    }


}
