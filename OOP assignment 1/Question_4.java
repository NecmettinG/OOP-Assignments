import java.util.Scanner;
public class Question_4 {

    public static void main(String[] args){
        //The program will be in a loop until the user inputs a non-divisible number by 3.
        Scanner input = new Scanner(System.in);
        boolean loop_status = true;
        while(loop_status) {
            System.out.println("Enter the number for checking it is divisible by 3 or not:");
            int number = input.nextInt();
            //input.nextLine();

            if (number % 3 == 0) {
                System.out.printf("%d is divisible by 3\n", number);
            }
            else {
                System.out.printf("%d is not divisible by 3\n", number);
                loop_status = false;
            }
        }
    }
}
