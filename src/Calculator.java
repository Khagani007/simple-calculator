import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operator;
        double n1, n2;

        System.out.println("1 - Add\n2 - Substract\n3 - Multiply\n4 - Divide");
        System.out.println("Choose Operator : ");
        Scanner scanner = new Scanner(System.in);
        operator = scanner.nextInt();
        System.out.println("Enter first number : ");
        n1 = scanner.nextDouble();
        System.out.println("Enter second number : ");
        n2 = scanner.nextDouble();
        scanner.close();
        double result = 0;
        switch (operator) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.println("Entered operator is not valid");
        }
        System.out.println("Result : " + result);

    }
}