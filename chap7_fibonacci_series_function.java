import java.util.Scanner;

public class chap7_fibonacci_series_function {
    public static void fib(int n){
        //0 1 1 2 3 5 8 13
        //a=0 b=1 c=a+b
        int [] arr= new int[n];
        int i=0;
        int sum=1;
        arr[0]=0;
        arr[1]=arr[0]+1;
// PROGRAM GALAT HAI THIS IS NOT THE METHOD FOR PRINTING FIBONACCI SERIES
        if(n==1)
            System.out.println(arr[0]);
        else if(n==2)
            System.out.println("the fibonacci series is "+arr[0]+" "+arr[1]);
        else if(n>2){
            System.out.print("the fibonacci series is "+ arr[0]+" "+arr[1]+" ");
            for(i=2;i<n;i++){
                arr[i]=arr[i-2]+arr[i-1];
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        fib(n);
    }
}
