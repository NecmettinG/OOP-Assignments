package FactorialCalculator;
import java.util.Scanner;
public class NumberChecker {

    private int number;

    public NumberChecker(int fact_number){

        number = fact_number;
    }

    public void controller() {

        if (number < 0) {

            throw new IllegalArgumentException("Negative values cannot be calculated for factorial");
        }
        else {
            CalculatorFact calcu_object = new CalculatorFact(number);
            int result = calcu_object.fact_returner();
            System.out.printf("The result: %d" ,result);
        }
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer number for calculating its factorial. Don't enter negative numbers: ");
        int main_number = input.nextInt();
        NumberChecker Checker_Object = new NumberChecker(main_number);

        try {
            Checker_Object.controller();
        }
        catch (IllegalArgumentException error){
            System.out.println("Invalid input:" + error.getMessage());
        }

    }
}

