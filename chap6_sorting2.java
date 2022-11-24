import java.util.Scanner;

public class chap6_sorting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of array");
        int n = sc.nextInt();
        //System.out.println("enter the number to be searched in the array");
        // float a = sc.nextFloat();
        float[] marks = new float[n];
        int i = 0;
        float sum = 0;
        System.out.println("enter the elements");
        for (i = 0; i < n; i++) {
            marks[i] = sc.nextFloat();
        }
        int l = marks.length;
        int c = 0;
        float max = marks[0];
        for (i = 0; i < l; i++) {
            if (marks[i] > max) {
                max = marks[i];
                c = c + 1;
            }
        }
        // if sorted in descending order count=0
        //if sorted in ascending order count= n-1
        if (c==0){
            System.out.println("sorted in descending order");
        }
        else if (c==(n-1))
            System.out.println("sorted in ascending order");

        else
            System.out.println("not sorted");
    }
}
