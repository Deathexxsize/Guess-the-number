// 1. надо добавить мультплеер
// 2. таймер
// 3. Сохранение рекорда в бд
// 4. Таблица лидеров

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        System.out.println("====== УГАДАЙ ЧИСЛО ======");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        byte gameMode;
        while (true) {
            System.out.println("\n1. Играть в соло\n2. Играть в дуо");

            System.out.print("Выбрать: ");
            gameMode = scanner.nextByte();

            break;
        }

        while (true) {

            System.out.println("\n== Выберите уровень сложности! ==\n1. Легкий: 0 - 10\n2. Средний: 0 - 100\n3. Сложный: 0 - 1000");

            System.out.print("Выбрать: ");
            byte difficutly = scanner.nextByte();

            switch (difficutly) {
                case 1:
                    maxNumber = 10;
                    break;
                case 2:
                    maxNumber = 100;
                    break;
                case 3:
                    maxNumber = 1000;
                    break;
                default:
                    System.out.println("Выберите один из трех уровней сложности!");
                    continue;
            }
        break;
        }

        if (gameMode == 1){
            SoloPlayerGame.soloGame(maxNumber);
        } else if (gameMode == 2) {
            DuoPlayerGame.playerReg(maxNumber);
        }
    }

    public static int maxNumber;
}