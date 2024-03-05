import java.util.Scanner;

public class Main
{
    private static void task1()
    {
        int total = 0;
        for (int i = 2; i < 102; i += 2)
        {
            total += i;
        }
        System.out.println("Total of 2-100 inclusive: " + total);
    }

    private static Scanner in;

    private static int getInt()
    {
        while (true)
        {
            System.out.printf("Input an int: ");
            if (in.hasNextInt())
            {
                return in.nextInt();
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }
    }

    private static double getDouble()
    {
        while (true)
        {
            System.out.printf("Input a double: ");
            if (in.hasNextDouble())
            {
                return in.nextDouble();
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }
    }

    private static void task2()
    {
        while (getInt() >= 100)
        {
            System.out.println("Number must be less than 100!");
        }
    }

    private static void task3()
    {
        getDouble();
        System.out.println("It will take: " + (Math.log(2) / 0.05) + " years to double your investment");
    }

    private static void task4()
    {
        double num = 1.0;
        double dub = 0.0;

        System.out.println("Indicate when to stop multiplying by inputting '0'");
        dub = getDouble();
        while (dub != 0.0)
        {
            num *= dub;

            System.out.println("Indicate when to stop multiplying by inputting '0'");
            dub = getDouble();
        }

        System.out.println("Total: " + num);
    }

    private static void task5()
    {
        String[] strings = {
            "********",
            "********",
            "     ***",
            "  ***   ",
            "***     ",
            "********",
            "********",
        };

        for (String string : strings)
        {
            System.out.println(string);
        }
    }

    public static void main(String[] args)
    {
        in = new Scanner(System.in);

        //task1();
        //task2();
        //task3();
        //task4();
        task5();
    }
}