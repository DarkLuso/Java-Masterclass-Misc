import java.util.Scanner;

public class MinAndMax {

    public static void minAndMaxInput (){

        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt;

        int largeNumber = Integer.MIN_VALUE;

        int smallNumber = Integer.MAX_VALUE;

        int number;

        while (true){

            System.out.println("Enter Number: ");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt){

                number = scanner.nextInt();

                if (number < smallNumber)
                    smallNumber = number;

                if (number > largeNumber)
                    largeNumber = number;

            }

            else {
                System.out.println("Invalid Number");
                break;
            }

        }

        System.out.println("Largest Number = " + largeNumber + " Smallest Number = " + smallNumber);
        scanner.close();

    }

}
