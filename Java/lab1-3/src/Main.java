import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть номер одногрупника (1-10): ");
        int n = in.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("Атвіновський Олексій");
                break;
            case 2:
                System.out.println("Балан Олександр");
                break;
            case 3:
                System.out.println("Безушко Максим");
                break;
            case 4:
                System.out.println("Гловацький Олексій");
                break;
            case 5:
                System.out.println("Демко Степан");
                break;
            case 6:
                System.out.println("Дзюба Данил");
                break;
            case 7:
                System.out.println("Дмитрійчук Філіп");
                break;
            case 8:
                System.out.println("Довгаль Кіріл");
                break;
            case 9:
                System.out.println("Євинчук Павло");
                break;
			case 10:
                System.out.println("Єремій Віталій");
                break;
            default:
                System.out.println("Введене значення нема");
                break;
        }
    }
}
