import java.util.Scanner;

public class chap3_string_practise_set {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b= a.toLowerCase();
        System.out.println(b);
        // changing it to lower case

        System.out.println(a.replace(' ','_'));
        // replacing space with underscore

        //problem 3 finding if there is a double or triple space present in the string
        int z=a.indexOf("   ");
        if(z>0)
            //if double ya triple spaces nhi hote hai to output -1 aata h

        System.out.println("double space is present at the index "+z);
        else
            System.out.println("no double or triple space is present");
    }
}
