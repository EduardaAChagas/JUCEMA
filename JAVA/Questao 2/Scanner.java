import java.util.Scanner;

public class Scanner {
    private static Scanner input = new Scanner(System.in);
    public String LerString() {
        return input.next();
    }

    public int LerInteiro() {
        while(!input.hasNextInt()) {
            System.err.println(input.next() + ' valor inválido!');
            System.err.println('myint is: ');
        }
        return input.nextInt();
    }



}


// Scanner scanner = new Scanner(System.in);
// String myString = scanner.next();
// int myInt = scanner.nextInt();

// scanner.close();

// System.out.println("myString is: " + myString);
// System.out.println("myInt is: " + myInt);