import java.util.Scanner;

public class chap7_celcious_to_farenheit {
    public static float far(int cel){
        float far;
        far= (cel*1.8f) +32; //while using multi or div always write f warna answer galat aata h
        return far;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the temp in cel");
        int n= sc.nextInt();

        System.out.println(far(n));
    }
}
