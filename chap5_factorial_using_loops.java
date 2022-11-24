import java.util.Scanner;

public class chap5_factorial_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact=1;
        if(n>0) {
            for (int i = n + 1; i > 1; i--) {
                fact = fact * (i - 1);
            }
            System.out.println(fact);
        }
        else
        {
            System.out.println("invalid number");
        }
    }
}
