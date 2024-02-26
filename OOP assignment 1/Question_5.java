import java.util.Scanner;
public class Question_5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter numerator:");
        int numerator = input.nextInt();
        input.nextLine();
        System.out.println("Please enter denominator:");
        int denominator = input.nextInt();
        int conditional_statement = (numerator * 3) % (denominator * 2);

        if(conditional_statement == 0){
            System.out.println("Numerator tripled is a multiple of denominator doubled.\n");
        }
        else{
            System.out.printf("Numerator tripled is not a multiple of denominator doubled.\nThe remainder: %d",conditional_statement);
        }
    }
}
