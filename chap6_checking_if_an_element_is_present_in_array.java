import java.util.Scanner;

public class chap6_checking_if_an_element_is_present_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={54,23,12,34,67,98};
        System.out.println("enter the number to be searched in the array");
        int a = sc.nextInt();
        int i=0;
        boolean ispresent= true;
        while(i<arr.length){
            if (arr[i]==a)
                ispresent=false;
            i++;
            break;
        }
        if(ispresent){
            System.out.println("number not present");
        }
        else
            System.out.println("number is present");

    }
}
