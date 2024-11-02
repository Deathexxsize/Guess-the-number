// 1. надо добавить мультплеер
// 2. таймер
// 3. Сохранение рекорда в бд
// 4. Таблица лидеров

import java.util.Random;
import java.util.Scanner;

public class Main {
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

        int maxNumber;
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
            soloPlayGame(random, scanner, maxNumber);
        } else if (gameMode == 2) {
            duoPLayGame(random, scanner, maxNumber);
        }


    }


    public static void soloPlayGame(Random random, Scanner scanner, int maxNumber) {
        int SoloRan = random.nextInt(maxNumber + 1);

        while (true) {
            System.out.print("\nВведите число: ");
            int num = scanner.nextInt();

            if (num > maxNumber) {
                System.out.println("Введите число от 0 до " + maxNumber + "!");
            } else if (num > SoloRan) {
                System.out.println("Упс... мимо. Чуть ниже");
            } else if (num < SoloRan) {
                System.out.println("Упс... мимо. Чуть выше");
            } else {
                System.out.println("Вы угадали число! хэппи, хэппи, хэппи");
                break;
            }
        }
    }

    public static void duoPLayGame(Random random, Scanner scanner, int maxNumber) {
        int duoRan = random.nextInt(maxNumber + 1);

        System.out.print("\nВведите имя первого игрока: ");
        String firstPlayer = new Scanner(System.in).nextLine();

        System.out.print("Введите имя второго игрока: ");
        String secondPlayer = new Scanner(System.in).nextLine();

        
    }

}