import java.util.Random;
import java.util.Scanner;

public class DuoPlayerGame {
    public static void playerReg(int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int duoRan = random.nextInt(maxNumber + 1); // Загаданное число

        System.out.print("\nВведите имя первого игрока: ");
        String firstPlayer = new Scanner(System.in).nextLine();

        System.out.print("Введите имя второго игрока: ");
        String secondPlayer = new Scanner(System.in).nextLine();

        distributor(firstPlayer, secondPlayer, duoRan);
    }

    private static void distributor(String firstPlayer, String secondPlayer, int duoRan) {
        while (true) {
            if (queuePlayers == 0) {
                duoGame(firstPlayer, duoRan);
                queuePlayers++;
            } else {
                duoGame(secondPlayer, duoRan);
                queuePlayers--;
            }
        }
    }

    public static int queuePlayers = 0;

    private static void duoGame(String player, int duoRan) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

            System.out.print("\n" + player + ", введите число: ");
            int num = scanner.nextInt();

            if (num > Menu.maxNumber) {
                System.out.println("Введите число от 0 до " + Menu.maxNumber + "!");
            } else if (num > duoRan) {
                System.out.println("Упс... мимо. Чуть ниже");
            } else if (num < duoRan) {
                System.out.println("Упс... мимо. Чуть выше");
            } else {
                System.out.println("╔═════════════════════════════════════════╗");
                System.out.println("                                           ");
                System.out.println("      ★   Поздравляем! "+ player +"   ★           ");
                System.out.println("                                           ");
                System.out.println("            Вы угадали число!              ");
                System.out.println("          Хэппи, хэппи, хэппи!             ");
                System.out.println("                                           ");
                System.out.println("╚═════════════════════════════════════════╝");
                System.exit(0);
            }
    }
}
