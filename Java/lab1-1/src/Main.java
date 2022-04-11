import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Завдання 1 обчислення формул.");
        Scanner in = new Scanner(System.in);
        float x = 0;

        System.out.print("Введіть y: ");
        float y = in.nextFloat();

        System.out.print("Введіть z: ");
        float z = in.nextFloat();

        if (y == 5)
        {
            x = (float)(Math.sqrt(3*y) - Math.pow(z, 2));
            System.out.printf("Результат (if): %f\n", x);
        }
        if (y == 10)
        {
            x = (float)(y/2.0 + 15 * z);
            System.out.printf("Результат (if): %f\n", x);
        }
        if (y == 2)
        {
            x = (float)(y*z - 7*z);
            System.out.printf("Результат (if): %f\n", x);
        }
        if(y !=5 && y!=10 && y!=2)
        {
            System.out.println("При введеному у неможливо обчислити.");
        }


        if (y == 5)
        {
            x = (float)(Math.sqrt(3*y) - Math.pow(z, 2));
            System.out.printf("Результат (if-else): %f\n", x);
        }
        else if (y == 10)
        {
            x = (float)(y/2.0 + 15 * z);
            System.out.printf("Результат (if-else): %f\n", x);
        }
        else if (y == 2)
        {
            x = (float)(y*z - 7*z);
            System.out.printf("Результат (if-else): %f\n", x);
        }
        else
        {
            System.out.println("При введеному у неможливо обчислити.");
        }
    }
}
