import java.util.Scanner;
import java.lang.Math;

public class WhichIsGreater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two integers between 0 and 10^9");
        String inputLine = scanner.nextLine();

        String[] parts = inputLine.split(" ");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);

        if (!(0 < a && a < Math.pow(10, 9) && 0 < b && b < Math.pow(10, 9))) {
            System.out.println("Value out of bounds, input two integers between 0 and 10^9");
        } else if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
            }

        }

    }
