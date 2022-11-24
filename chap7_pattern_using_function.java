import java.util.Scanner;

public class chap7_pattern_using_function {
    public static void pattern1(int x){
                                /*          *
                                            * *
                                            * * *
                                            * * * *
                                 */
        int i=0,j=0;
        for (i=0;i<x;i++){ //prints the number of rows required
            for(j=0;j<i+1;j++){
                //prints the column kyunki row se ek jyada ctar chahiye isiliye i+1 tk gya
                System.out.print("* "); //print ln hota to next line mein print hota na
            }
            System.out.println(); //wil bring the cursor to next line
        }
    }
    public static void pattern2(int x){
                                          /*     * * * *
                                                 * * *
                                                 * *
                                                 *
                                           */
        int i=0,j=0;
        for(i=x;i>0;i--){
            for(j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int x){
        /*           *
                   * *
                 * * *
               * * * *
         */
        int i=0,j=0;
        for(i=0;i<x;i++){
            //nhi ho paaya mereese
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("printing pattern 1");
        pattern1(n);
        System.out.println("printing pattern 2");
        pattern2(n);
    }

}
