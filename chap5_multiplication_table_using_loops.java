import java.util.Scanner;

public class chap5_multiplication_table_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        System.out.println("the multiplication table of "+n+ " is as follows");
        for (i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        System.out.println("the table in reverse order");
        for(i=10;i>0;i--) {
            System.out.println(n + " x " + i + " = " + n * i);

        }
        System.out.println("printing table using while loop ");
        while(i<11){
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }

    }
}
