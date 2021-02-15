import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int luckyNumber = 32;

        if (number%2 == 0) {
            System.out.println("It's a round number");
        }
        if (number%10 == 0) {
            System.out.println("It's an even number");
        }
        if (number == luckyNumber) {
            System.out.println("It's the lucky number");
        }
        if (number >= 10 && number < 100) {
            System.out.println("It have two digits");
        }

    }
}