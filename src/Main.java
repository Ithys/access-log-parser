import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
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

        int count=1;
        while(true){
         String path = new Scanner (System.in).nextLine();
         File file = new File(path);
         boolean fileExist = file.exists();
         boolean isDirectory = file.isDirectory();
         if ((fileExist || isDirectory)==false)
         {System.out.println("Файл не существует или указанный путь является путём к папке");
         continue;}
         else {System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + count++);}
        }
    }
}