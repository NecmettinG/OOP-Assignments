package GraphicalUserInterfaceSwitchCase;
import java.util.Scanner;
public class GUI {

    private double number_1, number_2;

    public GUI(double instance_num1, double instance_num2){
        number_1 = instance_num1;
        number_2 = instance_num2;
    }

    public double addition(){

        return number_1 + number_2;
    }
    public double subtraction(){

        return number_1 - number_2;
    }
    public double multiplication(){
        return number_1 * number_2;
    }
    public double division(){
        return number_1 / number_2;
    }
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double x = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double y = input.nextDouble();
        GUI operations = new GUI(x, y);

        System.out.println("~~ WELCOME to basic calculator program ~~");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        int selection = input.nextInt();
        double result;
        switch (selection){

            case 1:
                result = operations.addition();
                System.out.println("The addition: " +result);
                break;
            case 2:
                result = operations.subtraction();
                System.out.println("The subtraction: " +result);
                break;
            case 3:
                result = operations.multiplication();
                System.out.println("The multiplication: " +result);
                break;
            case 4:
                result = operations.division();
                System.out.println("The division: " +result);
                break;

            default:
                System.out.println("Invalid selection!");
        }

    }
}
