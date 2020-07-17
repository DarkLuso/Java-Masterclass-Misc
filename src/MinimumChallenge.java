import java.util.Scanner;

public class MinimumChallenge {

    public static int[] readIntegers (int count){

        int[] array = new int[count];
        System.out.println("Write " + count + " Number(s)");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < count;) {

            System.out.println("Number #" + i);

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                array[i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Value");
                scanner.nextLine();
            }
        }
        return array;
    }

    public static int findMin (int[] array){

        int minNumber = 0;
        boolean first = true;

        for (int i = 0; i < array.length; i++){
            if (first){
                minNumber = array[i];
                first = false;
            }
            if (array[i] < minNumber)
                minNumber = array[i];

        }

        return minNumber;

    }

}
