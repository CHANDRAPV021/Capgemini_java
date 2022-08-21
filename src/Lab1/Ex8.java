package Lab1;

public class Ex8 {
    public static void main(String[] args) {
        int n = 16;//yes it is
        if((n & (n - 1)) == 0){
            System.out.println("Yes number is power of 2");
        }else{
            System.out.println("Yes number is not power of 2");

        }
    }
}
