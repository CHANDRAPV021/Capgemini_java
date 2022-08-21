package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i < 5;i++){
            arr[i] = sc.nextLine();
        }
//        for (Object i : arr){
//            System.out.println(i + " ");
//        }
        Arrays.sort(arr);
        for (int i = 0;i < 5;i++){
            if(i <= (5/2)){
                System.out.println(arr[i].toUpperCase() + " ");
                continue;
            }
            System.out.println(arr[i].toLowerCase() + " ");
        }

    }
}
