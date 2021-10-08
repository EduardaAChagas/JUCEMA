import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();

        int tamanho; 
        tamanho = myString.length(); // ma ele so vai pegar o tamanho da primeira string
       	System.out.println(myString.length()); //agora to
        scanner.close();
  }
}