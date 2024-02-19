import java.util.Scanner;

public class TimeLoop {

    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        /*
        for (variabel erklæres; variabel i er mindre end eller lig med variabel n; i tæller op)
        så længe i er mindre eller lig med n, kør loopet og tilføj én til i.
         */

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " Abracadabra");


        }
    }
}
