import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Сложение
                Scanner scanner = new Scanner(System.in);
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println(sum);
        //Вычитание
                int num3 = scanner.nextInt();
                int num4 = scanner.nextInt();
                int sub = num3 - num4;
                System.out.println(sub);
        //Умножение
                int num5 = scanner.nextInt();
                int num6 = scanner.nextInt();
                int mul = num5 * num6;
                System.out.println(mul);

    }
}