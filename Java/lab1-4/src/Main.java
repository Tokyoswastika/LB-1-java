import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Обчислення значення функції:");
        System.out.print("Введіть x: ");
        int x = in.nextInt();
        System.out.print("Введіть y: ");
        int y = in.nextInt();

		

        try {
			double a1 = x - y;
            if (a1 < 0) {
                throw new ArithmeticException("Число під коренем не може бути меньше 0.");
            }
			
			double a2 = Math.sqrt(a1);
            if (a2 == 0) {
                throw new ArithmeticException("Знаменник не може бути 0");
            }
			
			double f = (x*x + y*y) / a2;
            System.out.printf("Результат: %.2f\n", Math.sqrt(f));
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
