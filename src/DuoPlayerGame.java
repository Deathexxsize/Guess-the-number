import java.util.Random;
import java.util.Scanner;

public class DuoPlayerGame {
    public static void duoGame (int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int duoRan = random.nextInt(maxNumber + 1);

        System.out.print("\nВведите имя первого игрока: ");
        String firstPlayer = new Scanner(System.in).nextLine();

        System.out.print("Введите имя второго игрока: ");
        String secondPlayer = new Scanner(System.in).nextLine();

        int queuePlayers = 0;

        if (queuePlayers == 0) {
            // очередь первого игрока
        } else {
            // очередь второго игрока
        }

    }
}
