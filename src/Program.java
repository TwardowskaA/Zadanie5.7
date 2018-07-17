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

        for (int i = imiona.length - 1; i >= 0 ; --i) {
            System.out.println("Cześć" + " " + imiona[i]);


        }
    }

}
