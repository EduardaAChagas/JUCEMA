import java.util.Scanner;

public class Teclado {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inteiro1;
        int inteiro2;
        int inteiro3;

        inteiro1 = scanner.nextInt();
        inteiro2 = scanner.nextInt();
        inteiro3 = scanner.nextInt();

        System.out.println("" + inteiro1);
        System.out.println(inteiro2);
        System.out.println(inteiro3);

        scanner.close();
    }
}