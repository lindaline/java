package linda.Game;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.print(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret) {
            System.out.print("please enter a number:");
            number = scanner.nextInt();
            if (number < secret) {
                System.out.println("higher");
            } else if (number > secret) {
                System.out.println("lower");
            } else {
                System.out.println("Great,thr number is" + number);
            }
        }
    }
}
