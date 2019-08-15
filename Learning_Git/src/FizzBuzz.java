import java.util.Scanner;
public class FizzBuzz {

    public static void main(String args[]) {

        System.out.println("Rules to play Fizzbuzz");
        System.out.println("multiple of 5 , you say Fizz");
        System.out.println("mutilple of 7 , you say Buzz");
        System.out.println("Multiple of both , you say Fizzbuzz");

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number to begin");
        int num = reader.nextInt();

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 5 == 0) {
            System.out.println("Fizz");
        } else if (num % 7 == 0) {
            System.out.println("Buzz");

        } else {
            System.out.println("Not a multiple of 5 or 7");
        }
        reader.close();
    }
}
