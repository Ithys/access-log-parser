import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите п1ервое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        int sum = number1 + number2;
        int minus  = number1 - number2;
        int multuplite = number1 * number2;
        double quotient = (double) number1 / number2;
        System.out.println("Сумма:" + sum);
        System.out.println("Разность:" + minus);
        System.out.println("Произведение:" + multuplite);
        System.out.println("Частное:" + quotient);
    }
}