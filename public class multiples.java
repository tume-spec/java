public class Multiples {

    public static void main(String[] args) {

        // Loop through numbers from 71 to 150
        for (int i = 71; i <= 150; i++) {

            // Check if the number is divisible by 2, 3 and 7
            if (i % 2 == 0 && i % 3 == 0 && i % 7 == 0) {

              System.out.println(i + ":");
            }
        }
    }
}