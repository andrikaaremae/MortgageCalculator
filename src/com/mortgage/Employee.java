package com.mortgage;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private static int numberOfEmployees;

    // constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    // constructor overloading
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours){
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
}
