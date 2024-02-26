package SequentialInput;

import java.util.Scanner;

public class Sequent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values to be entered: ");
        int quantity_values = scanner.nextInt();


        while (quantity_values <= 0) {
            System.out.println("Please enter a positive number.");
            System.out.print("Enter the number of values to be entered: ");
            quantity_values = scanner.nextInt();
        }

        int sum = 0;
        int counter = 0;

        do {
            System.out.print("Enter value #" + (counter + 1) + ": ");
            int currentValue = scanner.nextInt();


            sum += currentValue;
            counter++;
        } while (counter < quantity_values);


        System.out.println("The sum of entered values is: " + sum);

    }
}
