import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        String hello =  scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String novaStr;

        novaStr = hello.substring(start,end);
        System.out.println(novaStr);
    }
}
