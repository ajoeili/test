import java.util.Random;

public class Terningkast {

    public static void main(String[] args) {

        Random rand = new Random();

        int sum = 0;
        int numberOfRolls = 0;

        while(sum != 7) {
            int terning1 = rand.nextInt(6)+1;
            int terning2 = rand.nextInt(6)+1;

            sum = terning1 + terning2;
            numberOfRolls++;

            System.out.println(terning1 + " + " + terning2 + " = " + sum);

            if (sum == 7) {
                System.out.println("Wow sejt! Du fik 7 i " + numberOfRolls + ". kast!");
            }
        }

    }
}
