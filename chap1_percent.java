import java.util.*;
public class chap1_percent {

    public static void main(String[]args){
        System.out.println("enter the nubers of 5 subjects");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();
        float percentage= (a+b+c+d+e)/5f;


        System.out.println(percentage );
    }
}
