import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean validInput = false;
        String trash = " ";

        do {
            System.out.println("Enter degrees C: ");
            if (in.hasNextDouble()) {
                double degreesC = in.nextDouble();
                in.nextLine();
                double degreesF = degreesC * 9 / 5 + 32;
                System.out.println("That is " + degreesF + " degrees F");
                validInput = true;
            } else ;
            {

                if (in.hasNext()) {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash);
                    System.out.println("Run the program again and try again");
                }
            }
        } while (!validInput);
    }
}