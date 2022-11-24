public class chap6_reversing_array {
    public static void main(String[] args) {
        int []marks= {98,99,97,101,102};
        System.out.println("original array");
        int l=marks.length;
        int i=0;
        //METHOD 1
        for(i=0; i<l;i++)
            System.out.print(marks[i]+" ");
        System.out.println(" ");
        System.out.println("reversed array");
        for(i=l-1;i>=0;i--)
            System.out.print(marks[i]+" ");
        System.out.println(" ");
        System.out.println("reversing array by swapping");
    // METHOD2 SWAPPING NUMBERS
        int temp=0 ;
        // swapping method marks[i]= marks[l-i-1] where l= lenght of the string


        for( i=0;i<l/2;i++){
            temp= marks[i]; //temp mein marks [i] store ho gya marks [i] is blank now
            marks[i]= marks[l-1-i]; // marks [i] mein marks[i-1-i] store ho gya
            marks[l-1-i]= temp;

        }
        for (int element: marks) {
            System.out.print(element+" ");
        }

    }

}
