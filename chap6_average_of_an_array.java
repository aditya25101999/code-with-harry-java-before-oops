import java.util.Scanner;

public class chap6_average_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int n = sc.nextInt();
        //System.out.println("enter the number to be searched in the array");
        // float a = sc.nextFloat();
        float[] arr = new float[n];
        int i = 0;
        float sum=0;
        System.out.println("enter the elements");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        for (i = 0; i < n; i++){
            sum=(sum+arr[i]);
        }
        float average=sum/n;
        System.out.println(average);

    }
}
