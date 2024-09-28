import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        boolean validInput = false;

        do {
            System.out.print("Enter a temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true; // valid input received
            } else {
                // handle invalid input
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // clear invalid input
            }
        } while (!validInput); // loop until valid input is received

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);

        scanner.close(); // close scanner
    }
}