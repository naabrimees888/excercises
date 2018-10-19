import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println("Insert 5 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[4];

        if (number <= 0) {
            System.out.println("Number is negative or 0!");
        } else {
            // System.out.println("Enter new number: ");
            for (int i = 0; i < array.length; i++){
                array[i] = scanner.nextInt();
            }
        }
        int maxNumber = array[0];

        String maxNumberIndexes="0 ";
        for (int i = 1; i < array.length; i++) {
            if (array[i]==maxNumber) {
                maxNumberIndexes += (i + " ");
            }else if(array[i]>maxNumber){
                maxNumber = array[i];
                maxNumberIndexes = i + " ";
            }
        }

        System.out.println("Max value: " + maxNumber);
    }
}
