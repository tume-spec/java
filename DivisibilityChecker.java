public class DivisibilityChecker {

  public static void main(String[] args) {
    // Get input from the user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    checkDivisibility(number);
  }

  public static void checkDivisibility(int number) {
    // Extract the last digit
    int lastDigit = number % 10;

    // Check divisibility by 5
    if (lastDigit == 0 || lastDigit == 5) {
      System.out.println(number + " is divisible by 5 because the last digit is " + lastDigit + ".");
    }

    // Check divisibility by 2 (even number)
    if (lastDigit % 2 == 0) {
      System.out.println(number + " is divisible by 2 because the last digit is even.");
    }
  }
}