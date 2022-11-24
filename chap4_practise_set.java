import java.util.Scanner;

public class chap4_practise_set {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //problem 2

        /*System.out.println("enter the marks");
        int a= sc.nextInt();
        int c= sc.nextInt();
        int b= sc.nextInt();
        if (a<33 || b<33 || c<33)
            System.out.println("fail");
        else if ((a+b+c)/3<40)
            System.out.println("fail 2");
        else
            System.out.println("pass");

         */
//problem 3
        int d= sc.nextInt();
        if (d<250000) {
            System.out.println("no tax is being paid");
        }
        else if (d>250000 && d<500000){
        float tax= (d*5)/100f;
        System.out.println("the tax paid is :"+tax);
        }
        else if (d>500000&& d<1000000) {

            float tax2 = (d * 10) / 100f;
            System.out.println("the tax paid is :" + tax2);
        }
        else {
            float tax3 = (d * 30) / 100f;
            System.out.println("the tax paid is :" + tax3);
        }
    }
}
