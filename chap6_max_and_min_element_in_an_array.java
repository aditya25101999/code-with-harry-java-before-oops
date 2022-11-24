import java.util.Scanner;

public class chap6_max_and_min_element_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []marks= {98,67,97,99,54,78};
        int i=0,max=marks[0]  ,min=marks[0];
        int l=marks.length;
        for(i=0;i<l;i++){
            if( marks[i]>max){
                max=marks[i];
            }
            if(marks[i]<min){
                min=marks[i];
            }

        }
        System.out.println(max+" is the maximum element  of the array");
        System.out.println(min+" is the minimum element of the array");
    }
}
