import java.util.*;
public class chap5_sum_of_n_even_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + i*2;
            //even numbers zero se start hota hai
            // 0 2  4 6 8 isiliye less than n likhe
        }
        System.out.println(sum);
    }
}
