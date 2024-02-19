import java.util.Scanner;

public class Portoberegner {

    public static void main (String[] args) {

        double weight;
        int price = 0;

        Scanner input = new Scanner(System.in);

        //input til beregning
        System.out.println("Indtast vægten af brevet i gram");
        weight = input.nextDouble();

        if (weight <= 0 || weight > 500) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        } else {
            if (weight <= 100) {
                price = 25;
            } else {
                if (weight > 100 && weight <= 250) {
                price = 50;
                } else {
                    if (weight > 250 && weight <= 500) {
                        price = 75;
                    }
                }
            } System.out.println("Prisen for brevet er: " + price + " kr");
        }
    }


}
