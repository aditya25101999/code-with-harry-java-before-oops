import java.util.Scanner;

public class chap6_sum_of_elements_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        int i=0;
        float sum=0;
        System.out.println("enter the elements of the array");
        for(i=0;i<arr.length;i++) {

            arr[i] = sc.nextFloat();
        }
        //user is entering the elements of the array
        for(i=0;i<arr.length;i++) {
        //the elements of array are being printed

          //  System.out.println(arr[i]);
            sum =sum+ arr[i];
        }
        System.out.println(sum);
        System.out.println("method 2");
        float add=0;
        for(float elements: arr){
            add=add+elements;
        }
        System.out.println(add);

    }
}
