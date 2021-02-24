import java.util.Random;
import java.util.Scanner;

public class ThirdLesson {

    public static void main(String[] args) {
        guessNum();

    }
    /*
     1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
      При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
      После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
*/

    static void guessNum() {
        System.out.println("This is the guessing game. Computer will pick a number from 0 to 9 and you should guess this value.\n" +
                " You will be given 3 attempts. Computer will help you and will tell if your number is greater or smaller than computer number.");
        System.out.println("Please enter any number from 0 to 9.");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int compnum = rand.nextInt(10);

        for (int attempts =0; attempts < 3; attempts++) {
            int usernum = scanner.nextInt();
            if (usernum == compnum) {
                System.out.println("You win!");
            }
            else if (usernum > compnum) {
                System.out.println("Your number is greater than the number we're thinking of. Please try once more!");
            }
            else if (usernum < compnum) {
                System.out.println("Your number is smaller than the number we're thinking of. Please try once more!");
            }
            else if (attempts == 3) {
                System.out.println("You lose!");
            }
            attempts += 1;

        }
    }
}
