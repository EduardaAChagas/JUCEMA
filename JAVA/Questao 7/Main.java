import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static boolean isAnagram(String str1, String str2) {
        //se as duas strings não tem o mesmo tamanho, não é anagrama
        if ( str1.length() != str2.length() ) {
            return false;
        }
        //tranfroma em arrays para poder ordenar
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        //ordena para garantir a comparação simplificada
        Arrays.sort(c1);
        Arrays.sort(c2);
        //cria as novas strings baseadas nos arrays ordenados
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str1 =  scanner.nextLine();
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        scanner.close();
    }
}
