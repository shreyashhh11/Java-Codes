
import java.util.Scanner;

// package Functionss;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arm(n));

        // for(int i = 100;i < 1000;i++){
        //     if(arm(i)){
        //         System.out.println(i);
        //     }
        // } to print all armstrong of 3 digits
    }
    static boolean arm(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
