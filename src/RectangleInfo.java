import java.util.Scanner;
import static java.lang.Math.sqrt;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean validInput = false;
        do {
            System.out.println("Enter height: ");
            if(in.hasNextDouble()){
                height = in.nextDouble();
                validInput = true;
            }
        } while (!validInput);

        do {
            System.out.println("Enter width: ");
            if(in.hasNextDouble()){
                in.nextLine();
                width = in.nextDouble();
                validInput = true;
            }
        } while (!validInput);

        double area = width * height;
        double perimeter = width * 2 + height * 2;
        double pythag = width * width + height * height;
        double diagonal = sqrt(pythag);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);
    }
}
