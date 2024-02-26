import java.util.Scanner;
public class hasnext {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter integers
            System.out.println("Enter some integers (type 'exit' to stop):");

            // Loop as long as there is another integer in the input
            while (scanner.hasNextInt()) {
                // Read the next integer from the input
                int number = scanner.nextInt();

                // Process the integer (for example, print it)
                System.out.println("You entered: " + number);
            }

            // Close the scanner when done
            scanner.close();
        }
    }

