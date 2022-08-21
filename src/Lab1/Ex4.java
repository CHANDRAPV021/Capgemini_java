package Lab1;

public class Ex4 {
    public static boolean isPrime(int t){
        for(int i = 2;i <= Math.sqrt(t);i++){
            if((t % i) == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 20;//Primes up to n
        for(int i = 2;i <= n; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }

}
