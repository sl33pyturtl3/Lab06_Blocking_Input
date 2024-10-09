import java.util.Random;
import java.util.Scanner;


public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean onMoney = false;


        do {
            int randNum = rand.nextInt(11);
            System.out.println("Guess the number through 10: ");
            int guess = in.nextInt();

            if (guess > randNum) {
                System.out.println("Your guess is higher than the number");
            }
            else if (guess < randNum) {
                System.out.println("Your guess is lower than the number");
            } else if (guess == randNum) {
                System.out.println("Your guess is on the money");

            }
        } while (!onMoney);

    }
}
