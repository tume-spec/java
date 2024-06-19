import java.util.Scanner;

class Student{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);

		//prompt user for their marks
		System.out.print("Enter your operating system marks:");
		int operatingsystemmarks = scanner.nextInt();
		System.out.print("Enter your communication skills marks:");
		int communicationskillsmarks = scanner.nextInt();
		System.out.print("Enter your programmingmarks");
		int programmingmarks= scanner.nextInt();
		System.out.print("Enter your  structured cabling marks");
		int  structuredcablingmarks = scanner.nextInt();
		System.out.print("Enter your mathematic science marks");
		int mathematicsciencemarks = scanner.nextInt();
    double average = ( operatingsystemmarks + communicationskillsmarks +programmingmarks   + structuredcablingmarks + mathematicsciencemarks ) / 5;

        System.out.printf("The average marks is: %.2f%n", average);

        scanner.close();



	}
}