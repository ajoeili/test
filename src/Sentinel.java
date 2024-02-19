import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sentinel = -1;
        int sum = 0;
        int num = 0;

        System.out.println("Indtast de tal, der skal lægges sammen eller -1 for at stoppe.");

        while (num != sentinel) {
            num = input.nextInt();
            sum += num;
        }
        System.out.println("Sum: " + sum);


    }
}
