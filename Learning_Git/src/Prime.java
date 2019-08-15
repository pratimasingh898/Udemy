import java.util.Scanner;

public class Prime {

    public static void main(String args[]) {
        System.out.println("Please enter a number to check if its prime or not");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int flag = 0;
        if (num == 0 || num == 1) {
            System.out.println("number is not prime.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Number is prime");
        }
    }
}



