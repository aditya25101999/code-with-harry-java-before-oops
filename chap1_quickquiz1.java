import java.util.*;
public class chap1_quickquiz1 {
    public static void main(String[]args){
        char a='B';
        char b=a++;
        System.out.println(b);
        //the output is b as plus ya minus operator does not work on char
        int y=7;
        int x= ++y*8;
        System.out.println(x);
        // pehle y badha phir multiply hua
        float p= (7/4f)*(9/2f);
        //float use krne k liye hr jagah f lagana jaruri hota hai warna wo sirf gretest integer tk ka hi solve karega
        System.out.println(p);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int z= sc.nextInt();

        if(z>y)
            System.out.println("user input is greater than y");
        else if (z<y)
            System.out.println("user inputis less than y");
        else
            System.out.println("ewual");

    }
}
