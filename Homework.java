import java.util.*;

public class Homework {

    private static int arraySize;
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array length: ");
        arraySize = scanner.nextInt();
        int[] array = createRandomIntArray();

        boolean isOver = false;

        while (!isOver) {
            // Displaying the menu
            System.out.println ("\nMenu Options:");
            System.out.println ("1. Find the minimum and maximum of the array");
            System.out.println ("2. Find the average of the array and the differences from the average");
            System.out.println ("3. Find the sum of elements with odd and even indexes");
            System.out.println ("4. Exit");

            System.out.print ("\nChoose Operation: ");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println ("The minimum of the array is " + findMin(array));
                System.out.println ("The maximum of the array is " + findMax(array));
            }
            else if (operation == 2) {
                System.out.println ("The average of the array is " + findAverage(array));
                
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

    // Method that creates an int array of a given number of int's randomly selected from the [0,100] range.
    public static int[] createRandomIntArray()
    {

        int[] arr = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++)
        {
            arr[i] = random.nextInt(101);
        }

        return arr;

    }

    //Method for finding the minimum of the array
    public static int findMin (int array[])
    {
        int minimum = array[0];
        //Changing the minimum if there is a smaller element than the current minimum
        for (int i = 1 ; i < arraySize ; i++)
        {
            if (array[i] < minimum)
                minimum = array[i];
        }
        return minimum;
    }
    //Method for finding the maximum of the array
    public static int findMax (int array[])
    {
        int maximum = array[0];
        //Changing the maximum if there is a larger element than the current maximum
        for (int i = 1 ; i < arraySize ; i++)
        {
            if (array[i] > maximum)
                maximum = array[i];
        }
        return maximum;
    }

    //Method for finding the sum of elements with odd numbered indexes.
    public static int findOddSum (int array[])
    {
        int sumOdd = 0;
        if (arraySize > 1)
        {
            for (int i = 1; i < arraySize; i++ )
            {
                sumOdd += array[i];
                i++;
            }
        }
        return sumOdd;
    }
    //Method for finding the sum of elements with even numbered indexes.
    public static int findEvenSum (int array[])
    {
        int sumEven = 0;
        if (arraySize > 0)
        {
            for (int i = 0; i < arraySize; i++ )
            {
                sumEven += array[i];
                i++;
            }
        }
        return sumEven;
    }

    //Method for finding the average of the array and the difference of elements from the average.
    public static double findAverage(int array[])
    {
        int result = 0; 

        for (int element : array)
        {
            result += element;
        }

        double average = (double)result / arraySize;
        double [] diff = new double[arraySize];
        System.out.print("Difference of each element from the average: ");

        for (int i = 0; i < arraySize; i++)
        {
            diff[i] = array[i] - average;
            if(i > 0)
            {
                System.out.print(", ");
            }
            System.out.printf("%.1f", diff[i]);
        }
        
        System.out.println();

        return average;
    }

    

}
