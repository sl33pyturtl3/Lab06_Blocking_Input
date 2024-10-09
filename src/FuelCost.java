import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        double milesPerGallon = 0;
        double gallonsInTank = 0;
        double gasPrice = 0;
        do {
            System.out.println("Enter how many gallons in the tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine();
                validInput = true;
            } else if (in.hasNext()){
                String trash = in.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Please enter a valid input next time!");
            }
        } while (!validInput);

        do {
            System.out.println("Enter how many miles per gallon do you get?: ");
            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                validInput = true;
            } else if (in.hasNext()){
                String trash = in.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Please enter a valid input next time!");
            }
        } while (!validInput);

        do {
            System.out.println("Enter price of a gallon of gas: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                validInput = true;
            } else if (in.hasNext()){
                String trash = in.nextLine();
                System.out.println("You entered " + trash);
                System.out.println("Please enter a valid input next time!");
            }
        } while (!validInput);

        double costForHundoMiles = 100 / milesPerGallon * gasPrice;
        double fullTank = milesPerGallon * gallonsInTank;

        System.out.println("It would cost $" + costForHundoMiles + " to drive 100 miles");
        System.out.println("On a full tank you can drive " + fullTank + " miles");
    }
}