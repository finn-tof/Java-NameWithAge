 package namewithage;
import java.util.Scanner;

public class NameWithAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user's name
        System.out.print("Enter your Name: ");
        String yourName = scanner.nextLine();  // Changed to nextLine() to capture the name as a String

        // Asking for user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Printing the output
        System.out.println("Hello, My name is " + yourName + " and I am " + age + " years old.");

        scanner.close();
    }
}
