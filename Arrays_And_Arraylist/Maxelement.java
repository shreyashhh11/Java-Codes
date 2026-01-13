
public class Maxelement {
    public static void main(String[] args) {
        // most simple way
        int[] arr = {1,4,32,54,9,10};
        max(arr);
        // Arrays.sort(arr);
        // int max = arr[arr.length-1];
        // System.out.println(max);

        
    }
    static void max(int[] arr){
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
