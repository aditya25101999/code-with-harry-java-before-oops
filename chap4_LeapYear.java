import java.util.Scanner;

public class chap4_LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int year= sc.nextInt();
        if (year%4 !=0)
            System.out.println("not leap");
        else if (year%100==0 && year%400!=0)
            System.out.println(" not a leap century");
        else
            System.out.println("leap");

        //website determining
        String a= sc.next();
        if (a.endsWith(".org"))
            System.out.println("organisational website");
        else if (a.endsWith(".com"))
            System.out.println("commercial website");
        else if (a.endsWith(".in"))
            System.out.println("indian website");
    }
}
