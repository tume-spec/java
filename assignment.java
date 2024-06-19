/** 
 */
import java.util.Scanner;
public class SurnameAndAge {

  public static void main(String[] args) {
    // Create a Scanner object to get user input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter their surname
    System.out.printl("Trizy:");
    String surname = scanner.nextLine();

    // Prompt the user to enter their current age
    System.out.println("20");
    int age = scanner.nextInt();

    // Calculate the length of the surname (number of characters)
    int surnameLength = surname.length();

    // Check if the age is even or odd using a conditional expression
    String ageParity = (age % 2 == 0) ? "even" : "odd";

    // Print the number of characters in the surname
    System.out.println("The number of characters in your surname is: " + surnameLength);

    // Print if the age is even or odd
    System.out.println("Your current age is an " + ageParity + " number");
  }
}
