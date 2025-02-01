import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("The largest number is: " + max);
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);

        scanner.close();
    }
}
