import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array Creation Here

        boolean isOver = false;

        while (!isOver) {
            // Displaying the menu
            System.out.println ("Menu Options:");
            System.out.println ("1. Find the minimum and maximum of the array");
            System.out.println ("2. Find the average of the array and the differences from the average");
            System.out.println ("3. Find the sum of elements with odd and even indexes");
            System.out.println ("4. Exit");

            System.out.print ("Choose Operation: ");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println ("The minimum of the array is " + findMin(array));
                System.out.println ("The maximum of the array is " + findMax(array));
            }
            else if (operation == 2) {
                System.out.println ("The average of the array is " + findAverage(array));
                // Diff part here
            }
            else if (operation == 3) {
                System.out.println ("The sum of the elements with odd indexes is " + findOddSum(array));
                System.out.println ("The sum of the elements with even indexes is " + findEvenSum(array));
            }
            else if (operation == 4) {
                isOver = true;
                System.out.println ("Exiting...");
            }
            else {
                System.out.println ("Invalid operation. Please try again.");
            }
        }

        // Closing Scanner
        scanner.close();
    }
}