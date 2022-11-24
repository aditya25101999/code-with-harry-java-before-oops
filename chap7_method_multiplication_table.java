import java.util.Scanner;

public class chap7_method_multiplication_table {
    public static void table(int x) {
        int i = 1;
        System.out.println("the multiplication table of " + x + " is as follows");
        for (i = 1; i < 11; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
    public static void reversetable(int x){
        int i=1;
        System.out.println("the reverse table of "+x+" is as follows");
        for(i=10;i>0;i--) {
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose table should be printed");
        int n = sc.nextInt();
        table(n);

        reversetable(n);
    }
}
