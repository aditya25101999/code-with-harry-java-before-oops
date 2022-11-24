import java.util.Scanner;

public class chap5_sum_of_odd_n_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        /*
        int sum=0,i=0;
        for(i=0;i<n;i++) {
            sum = sum + ((2 * i) + 1);
        }
        // odd numbers=(2n+1)
        System.out.println(sum);
        */
        //method 2
        int sum=0,i=0;
        while(i<n){
            sum = sum + ((2 * i) + 1);
            i++;
        }
        System.out.println(sum);
    }
}
