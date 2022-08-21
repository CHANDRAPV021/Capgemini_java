package Lab2;

import java.util.HashSet;
import java.util.Set;

public class Ex4 {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7,2,8,1,3,2,8};
        Set<Integer> hash_Set = new HashSet<Integer>();
        for (int i : arr){
            hash_Set.add(i);
        }
        for (Object i : hash_Set){
            //non duplicates.
            System.out.println(i);
        }
    }
}
