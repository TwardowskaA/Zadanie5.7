import java.lang.reflect.Array;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        String[] imiona = new String[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");

        for (int i = 0; i < imiona.length; i++) {
            imiona[i] = scan.nextLine();

        }

        for (int x = imiona.length - 1; x >= 0 ; --x) {
            System.out.println("Cześć" + " " + imiona[x]);


        }
    }

}
