import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        System.out.println("Sum of numbers = " + sumOfNumbers(number));

    }
        public static int sumOfNumbers(int number){

            int sum = 0;
            for (int i = 1; i <= number;i++){
                sum+= i;
            }
            return sum;
        }
}
