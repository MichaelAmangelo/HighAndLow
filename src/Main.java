import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter integer n, greater than 0: ");

            n = scan.nextInt();
        }

        while (n < 1);

        int[] arr = new int[n];
        System.out.print("Enter " + n + " integers: ");
        String arrString = "";

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            arrString += arr[i] + " ";
        }
        System.out.println();
        System.out.println("You entered: " + arrString);
        System.out.println();
        System.out.println("Maximum value: " + max(arr));
        System.out.println("Minimum value: " + min(arr));
        System.out.println("Average: " + avg(arr));
        System.out.println();
        GreaterThanA(arr);
        System.out.println();
        GreaterThanL(arr);
        Reverse(arr);

    }

    public static int max(int[] Array) {
        int max = Array[0];

        for (int i = 0; i < Array.length; i++) {

            if (Array[i] > max) {

                max = Array[i];
            }
        }
        return max;
    }

    public static int min(int[] Array)
    {
        int min = Array[0];

        for (int i = 0; i < Array.length; i++)
        {
            if (Array[i] < min)
            {
                min = Array[i];
            }
        }
        return min;
    }
    public static double avg(int[] Array)
    {
        int sum = 0;

        for (int i = 0; i < Array.length; i++)
        {
            sum += Array[i];
        }

        return (double) sum / Array.length;
    }

    public static void GreaterThanA(int[] Array)
    {
        double avg = avg(Array);

        System.out.println("Elements greater than average: ");

        for (int i = 0; i < Array.length; i++)
        {
            if (Array[i] > avg)
            {
                System.out.print(Array[i] + " ");
            }
        }
    }

    public static void GreaterThanL(int[] Array)
    {
        int lastElement = Array[Array.length - 1];

        System.out.println("Elements greater than " + lastElement + ": ");

        for (int i = 0; i < Array.length; i++)
        {
            if (Array[i] > lastElement)
            {
                System.out.print(Array[i] + " ");
            }
        }
        System.out.println();
    }
    public static void Reverse(int[] Array)
    {
        System.out.println("Array in reverse order: ");

        for (int i = Array.length - 1; i >= 0; i--)
        {
            System.out.print(Array[i] + " ");
        }
    }
}



