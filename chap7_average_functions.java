public class chap7_average_functions {
    public static float average1(int...arr ) {
        int i = 0;
        float sum = 0;
        for (i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum / arr.length;
    }
    public static float average2(int...arr){
        float sum=0;// agar int rakhte to 10/4=2.0 dega
// yahan pe v same varaible use kr skte hai jo dusre function mein kiye
        for(int a:arr){
            sum=sum+a;// yahan a k jahah kuch v likh skte hai that is just the name of elements in th arr
        }
        return sum/ arr.length;
    }

    public static void main(String[] args) {
        System.out.println(average1(1,5,6,3,4));
        System.out.println(average2(1,2,3,8,10,4));
    }

}
