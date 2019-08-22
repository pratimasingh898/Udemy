import java.util.ArrayList;
import java.util.Scanner;

public class Prime_in_Range {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first range to find the prime numbers");
        int firstRange = scan.nextInt();
        System.out.println("Please enter the last range to find the prime numbers ");
        int lastRange = scan.nextInt();
        int flag=0;
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = firstRange; i <= lastRange; i++) {
            for (int j = 2; j <= i-1; j++) {
                if (i % j == 0) {
                    flag=0;
                    break;
                }
                else{
                    flag=1;
                }
                }
            if(flag==1){
                arr.add(i);
            }

            }
        System.out.println(arr);
        }
    }
