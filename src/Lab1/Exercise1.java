package Lab1;

public class Exercise1 {
    public static void main(String[] args) {
        //Addition of cubes of digits of number.
        //1   2    3    4
        //1 + 8 + 27 + 64 = 100;
        int x = 1234;
        double ans = 0;
        int t;
        while(x > 0){
            t = x % 10;
            System.out.println(t);
            ans += Math.pow(t, 3);
            x /= 10;
        }
        System.out.println(ans);//!00 Expected
    }
}
