import java.util.Scanner;

public class MinAndMax {

    public static void minAndMaxInput (){

        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt;

        int largeNumber = Integer.MAX_VALUE;

        int smallNumber = Integer.MIN_VALUE;

        int number;

        boolean first = true;

        while (true){

            System.out.println("Enter Number: ");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt){

                number = scanner.nextInt();

                if (first){
                    first = false;
                    smallNumber = number;
                    largeNumber = number;
                }

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
