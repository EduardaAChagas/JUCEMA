import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class Main {

  public static String upperCaseFirst(String val) {
    char[] arr = val.toCharArray();
    arr[0] = Character.toUpperCase(arr[0]);
    return new String(arr);
 }
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int tamanho1, tamanho2, soma;
    String myString =  scanner.nextLine();
    String myString2 = scanner.nextLine();
    String [] vetor = new String[2];
    String firstLtr = myString.substring(0, 1);
    String restLtrs = myString.substring(1, myString.length());
    String firstLtr2 = myString2.substring(0, 1);
    String restLtrs2 = myString2.substring(1, myString2.length());

    tamanho1 = myString.length();
    tamanho2 = myString2.length();
    soma = tamanho1 + tamanho2;
    firstLtr = firstLtr.toUpperCase();
    myString = firstLtr + restLtrs;
    firstLtr2 = firstLtr2.toUpperCase();
    myString2 = firstLtr2 + restLtrs2;


    for (int i = 0; i <= 2; i++ ) {
      if (i == 0) {
        vetor[i] = myString;
      } else if (i == 1) {
        vetor[i] = myString2;
      }
    }
    
    System.out.println(soma);
    // item 2: ordenar
    Arrays.sort(vetor);
    for (int i = 0; i <= 2; i++) {
      System.out.println(vetor[i]);
    }
    scanner.close();



    }
    
}