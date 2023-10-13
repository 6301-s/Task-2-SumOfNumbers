package Sample;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
  if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;
            int i = 1;

            do {
                sum += i;
                i++;
            } while(i<=n);
           System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        }
scanner.close();
    }}
