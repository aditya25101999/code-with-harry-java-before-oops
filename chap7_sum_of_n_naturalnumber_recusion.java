import java.util.Scanner;

public class chap7_sum_of_n_naturalnumber_recusion {
    public static int sum(int x){
        if (x==0)
            return 0;// taki recursion kahin pr aake khatam ho jae
        else
            return x+sum(x-1);
        // x+sum(x-1)= x+(x-1)+sum(x-2)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the term upto which th sum  should be printed");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
