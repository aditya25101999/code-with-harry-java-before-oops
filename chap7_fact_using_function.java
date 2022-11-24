import java.util.Scanner;

public class chap7_fact_using_function {
    public static int fact(int x){
        int i=0;
        int factorial=1;
        if(x==1 || x==0)
            return 1;
        else
            for(i=1;i<=x;i++){
                factorial=factorial*i;
            }
            return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose factorial should be printed");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
