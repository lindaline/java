package linda.Game;

import java.util.Random;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.print("please enter a number(" + i + "4)");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次" + number);
            if (number > secret) {
                System.out.println("lower");
            }else if(number<secret){
                System.out.println("higher");
            }else{
                System.out.println("Great,the number's" + number);
                break;
            }
        }
        System.out.println("End");
    }
}
