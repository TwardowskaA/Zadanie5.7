import java.lang.reflect.Array;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 5 imion:");
        String imie1 = scan.nextLine();
        String imie2 = scan.nextLine();
        String imie3 = scan.nextLine();
        String imie4 = scan.nextLine();
        String imie5 = scan.nextLine();

        String[] imiona = new String[5];
        imiona[0] = "Cześć" + " " + imie1;
        imiona[1] = "Cześć" + " " + imie2;
        imiona[2] = "Cześć" + " " + imie3;
        imiona[3] = "Cześć" + " " + imie4;
        imiona[4] = "Cześć" + " " + imie5;

        for (int i = imiona.length -1; i >= 0 ; --i) {
            System.out.println(imiona[i]);
            
        }
        
    }




}
