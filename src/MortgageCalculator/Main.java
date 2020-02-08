package MortgageCalculator;

public class Main {

public static void main(String[] args) {
        var mortgage = new Mortgage();
        var calculator = new Calculator(mortgage);
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
        }
}