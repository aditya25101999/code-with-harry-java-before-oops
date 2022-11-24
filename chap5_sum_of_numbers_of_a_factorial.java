import java.util.Scanner;

public class chap5_sum_of_numbers_of_a_factorial {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum = sum + (n * i);
        }
        System.out.println(sum);
    }
}
