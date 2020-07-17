import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    private int[] array;

    public void getIntegers (int length){

        this.array = new int[length];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print "+ length +" numbers");

        for (int i = 0; i < length;){

            System.out.println("Number #" + i);

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                this.array[i] = scanner.nextInt();
                i++;
            }
            else {
                System.out.println("Invalid Value");
                scanner.nextLine();
            }
        }
    }

    public void sortIntegers (){

        array = multiplyByNegative(array);
        Arrays.sort(this.array);
        array = multiplyByNegative(array);

    }

    public int[] multiplyByNegative (int[] array){

        for (int i = 0; i < array.length; i++)
            array[i] = -1 * array[i];

        return array;
    }

    public void printArray(){
        if (this.array == null) {
            System.out.println("There's no Integers");
        }
        else {
            for (int i = 0; i < array.length; i++){
                System.out.println("Array[" + i + "] = " + array[i]);
            }
        }

    }

}
