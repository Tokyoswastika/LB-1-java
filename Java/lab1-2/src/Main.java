import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		System.out.println("Квадратне рівняння: ");

        System.out.print("Введіть a: ");
        int a = in.nextInt();

        System.out.print("Введіть b: ");
        int b = in.nextInt();
		
		System.out.print("Введіть c: ");
        int c = in.nextInt();
		
		int D = b*b - 4*a*c;
		
		if(D > 0)
		{
			System.out.println("Рівняння має 2 кореня (D>0)");
			double x1 = (-b + Math.sqrt(D)) / (2*a);
			double x2 = (-b - Math.sqrt(D)) / (2*a);
			
			System.out.printf("x1 = %.2f\n", x1);
			System.out.printf("x2 = %.2f\n", x2);
		}
		else if(D == 0)
		{
			System.out.println("Рівняння має 1 корінь (D=0)");
			double x = (-b) / (2*a);
			
			System.out.printf("x = %.2f\n", x);
		}
		else
		{
			System.out.println("Рівняння коренів немає");
		}
    }
}
