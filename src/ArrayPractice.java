public class ArrayPractice {

    public static void main(String[] args) {

        int[] myArray = new int[8];
        myArray[0] = 34;
        myArray[myArray.length-1] = 117;

        for (int i = 0; i <= myArray.length-1; i++) {
            System.out.print(myArray[i] + "");
        }
    }
}
