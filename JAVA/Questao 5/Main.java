import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();

        int length;
        length = myString.length();
        System.out.println(myString.length());
        scanner.close();
    }
}