import java.util.Scanner;

class AdvCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first value: ");
        
        double value1 = input.nextDouble();

        System.out.print("Enter second value: ");

        double value2 = input.nextDouble();

        input.close();

        double sum = value1 + value2;

        System.out.println(value1 + " + " + value2 + " = " + sum);
    }
}
