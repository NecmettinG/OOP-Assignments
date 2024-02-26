package FactorialCalculator;

public class CalculatorFact {
    private int calcunumber;
    public CalculatorFact(int parameter_number){

        calcunumber = parameter_number;
    }

    public int fact_returner(){
        int fact = 1;
        for (int x = 1; x<calcunumber+1; x++){

            fact = fact * x;
        }
        return fact;
    }

}
