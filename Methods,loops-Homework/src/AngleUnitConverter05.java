import java.util.Scanner;

/**
 * Created by User on 21.10.2015 ã..
 */
public class AngleUnitConverter05 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        int n = Integer.parseInt(Console.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = Console.nextLine().split(" ");
            float number = Float.parseFloat(input[0]);
            String degree = input[1];

            switch (degree) {
                case "deg":
                    ToRadians(number); break;
                case "rad":
                    ToDegreese(number); break;
                default:
                    System.out.println("Invalid input");break;
            }
        }
    }
    public static void ToRadians(float number){
        System.out.printf("%.6f rad\n", Math.toRadians(number));
    }
    public static void ToDegreese(float number){
        System.out.printf("%.6f deg\n",Math.toDegrees(number));
    }
}
