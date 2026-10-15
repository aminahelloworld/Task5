
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int count = 0;
        int number;
        int min = 101;
        int max = 0;

        while (count < 10) {
            number = random.nextInt(100) + 1;

            System.out.println("Number: " + number);

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }

            count++;
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
