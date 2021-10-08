import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        
        
        for (int i = 0; i <=10; i++){
            if (i > 0) {
                System.out.println(n + " X " + i + " = " + n*i);
            }
            
        }
    }

}


