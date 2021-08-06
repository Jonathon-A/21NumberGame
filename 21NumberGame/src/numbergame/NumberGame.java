package numbergame;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

public class NumberGame {

    public static void main(String[] args) throws InterruptedException {
        TimeUnit time = TimeUnit.SECONDS;
        long sleep = 2L;
        long sleep2 = 1L;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Starting number is 0, first to hit 21 loses.");
        int num = 0;
        while (num < 21) {
            int t = 1;
            while (t == 1) {
                System.out.println("Pick a number (1,2,3): ");
                int guess = 0;

                try {
                    guess = input.nextInt();

                } catch (Exception e) {

                    input.next();
                }

                if ((guess == 1) || (guess == 2) || (guess == 3)) {
                    t = 0;
                } else {
                    System.out.println("Incorrect number.");
                    guess = 0;
                }

                num = num + guess;
                if (num > 21) {
                    num = 21;
                }
            }
            int player = 1;
            int comp = 0;
            time.sleep(sleep2);
            System.out.println("");
            System.out.println("The number is " + num + ".");
            System.out.println("");
            if (num < 21) {
                int r1 = rand.nextInt(3);
                int comnum = r1 + 1;
                time.sleep(sleep);
                System.out.println("The computer picked " + comnum + ".");
                num = num + comnum;
                if (num > 21) {
                    num = 21;
                }
                player = 0;
                comp = 1;
                time.sleep(sleep2);
                System.out.println("");
                System.out.println("The number is " + num + ".");
                System.out.println("");
            }
            if (num == 21) {
                if (player == 1) {
                    System.out.println("The computer won.");
                }
                if (comp == 1) {
                    System.out.println("The player won.");
                }
            }
        }

    }

}
