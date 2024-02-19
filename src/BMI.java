import java.util.Scanner;

public class BMI {

    public static void main (String[] args) {

        //variabler til input
        double weight;
        double height;

        //scanner
        Scanner input = new Scanner(System.in);

        //input til beregning
        System.out.println("Enter your weight in kg");
        weight = input.nextDouble();
        System.out.println("Enter your height in meters");
        height = input.nextDouble();

        //beregning af bmi
        double bmi = weight/(height*height);

        System.out.println("Your BMI is: " + bmi);

        /*BMI < 18.5 undervægt
        BMI 18.5-24.9 er normal vægt
        BMI 25-29.9 overvægt
        BMI 30 - 34.9 fedme
        BMI 35 - 39,9 svær fedme
        BMI > 40 ekstrem overvægt*/

        String size = null;

        if (bmi < 18.5) {
            size = "underweight";
        } else {
            if (bmi >= 18.5 && bmi <= 24.9) {
                size = "normal weight";
            } else {
                if (bmi >= 25 && bmi <= 29.9 ) {
                    size = "overweight";
                } else {
                    if (bmi >= 30 && bmi <= 34.9) {
                        size = "obese";
                    } else {
                        if (bmi >= 35 && bmi <= 39.9) {
                            size = "greatly obese";
                        } else {
                            if (bmi >= 40) {
                                size = "extremely obese";
                            }

                        }
                    }
                }
            }
        }   System.out.println("According to BMI, you are " + size);

    }
}
