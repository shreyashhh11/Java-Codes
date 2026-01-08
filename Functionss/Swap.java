
import java.util.Arrays;





public class Swap {
    static int x = 45;
    // System.out.println(x);
    public static void main(String[] args) {
        int x = 56;
        System.out.println(x);
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(x);
        System.out.println("a" +a+ "and" +" b"+b);


        {
            int c = 90;
            System.out.println(c);
            // int a = 88;
            System.out.println(a);
        }

        int c = 78;
        System.out.println(c);
        {
            // int c = 98;
        }
        fun(8,45,5,5,5,5);
    }


    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
