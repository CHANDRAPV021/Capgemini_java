package Lab1;

public class Ex6 {
    public static void main(String[] args) {
        //Sigma(i^2 - i);
        int n = 10;
        int sum = 0;
        for(int i = 2;i<=n;i++){
            sum += i*(i - 1);
        }
        System.out.println(sum);
    }
}
