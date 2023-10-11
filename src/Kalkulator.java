import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        double operand1 = scanner.nextDouble();

        System.out.println("Unesi drugi broj: ");
        double operand2 = scanner.nextDouble();

        String operator = scanner.next();

        if (operator.equals("+")) {
            System.out.println("Rezultat je: " + (operand1 + operand2));
        } else if (operator.equals("-")) {
            System.out.println("Rezultat je: " + (operand1 - operand2));
        } else if (operator.equals("*")) {
            System.out.println("Rezultat je: " + (operand1 * operand2));
        } else if (operator.equals("/")) {
            System.out.println("Rezultat je: " + (operand1 / operand2));
            if (operand2 != 0) {
                System.out.println("Deljenje 0 nije dozvoljeno");
            }
        } else {
            System.out.println("Greska");
        }

        switch (operator) {
            case "+": {
                System.out.println("Rezultat je: " + (operand1 + operand2));
            }
            break;
            case "-": {
                System.out.println("Rezultat je: " + (operand1 - operand2));
            }
            break;
            case "*": {
                System.out.println("Rezultat je: " + (operand1 * operand2));
            }
            break;
            case "/": {
                System.out.println("Rezultat je: " + (operand1 / operand2));
                if (operand2 != 0) {
                    System.out.println("Deljenje 0 nije dozvoljeno)");
                }
            }
            break;
            default: {
                System.out.println("Greska");
            }

        }


    }
}

