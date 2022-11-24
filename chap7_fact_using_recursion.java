import java.util.Scanner;

public class chap7_fact_using_recursion {
    public static int factorail(int x){
        if (x==1 ||x==0)
            return 1;
        else
            return x*factorail(x-1);
        //
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose table should be printed");
        int n = sc.nextInt();
        System.out.println(factorail(n));
    }

}
