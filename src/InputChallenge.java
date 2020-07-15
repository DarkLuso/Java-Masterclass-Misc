import java.util.Scanner;

public class InputChallenge {

    public static void printTheSum (){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        boolean hasNextInt;

        for (int i = 1; i < 11;){

            System.out.println("Number #" + i);

             hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();
                i++;
            }
            else
                System.out.println("Invalid Value");

            scanner.nextLine();

        }

        System.out.println("Sum = " + sum);


    }

}
