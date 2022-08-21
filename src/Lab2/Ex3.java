package Lab2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int arr[] = {34,56,78,34,56,78};
        int arrRev[] = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            arrRev[i] = revNum(arr[i]);
        }
        Arrays.sort(arr);
        for(int i = 0;i < arrRev.length;i++){
            System.out.println(arrRev[i]);
        }
    }
    public static int revNum(int x){
        int num = 0;
        while(x > 0){
            num += (x % 10);
            num *= 10;
            x /= 10;
        }

        return num/10;
    }
}
