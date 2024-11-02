import java.util.Random;
import java.util.Scanner;

public class SoloPlayerGame {
    public static void soloGame(int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int soloRan = random.nextInt(maxNumber + 1);
        int attempt = 0;
        while (true) {
            System.out.print("\nВведите число: ");
            int num = scanner.nextInt();

            if (num > maxNumber) {
                System.out.println("Введите число от 0 до " + maxNumber + "!");
                attempt++;
            } else if (num > soloRan) {
                System.out.println("Упс... мимо. Чуть ниже");
                attempt++;
            } else if (num < soloRan) {
                System.out.println("Упс... мимо. Чуть выше");
                attempt++;
            } else {
                System.out.println("╔═════════════════════════════════════════╗");
                System.out.println("║                                         ║");
                System.out.println("║         ★   Поздравляем!   ★           ║");
                System.out.println("║                                         ║");
                System.out.println("║           Вы угадали число!             ║");
                System.out.println("║         Хэппи, хэппи, хэппи!            ║");
                System.out.println("║                                         ║");
                System.out.println("╠═════════════════════════════════════════╣");
                System.out.println("        Вам понадобилось " + attempt + " попыток!");
                System.out.println("╚═════════════════════════════════════════╝");

                break;
            }
        }
    }
}
