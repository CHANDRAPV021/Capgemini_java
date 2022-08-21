package Lab1;

public class Ex7 {
    public static void main(String[] args) {
        //Increasing Decreasing
        int n = 2000213;

        int prevDigit = n % 10;
        boolean increasing = true;
        n /= 10;
        int temp;
        while(n > 0){
            temp = n%10;
            n /= 10;
            //System.out.println(temp+" " +prevDigit);
            if(temp <= prevDigit){//condition of increasing is <= nd whereas Strictly increasing is < only.
                prevDigit = temp;
                continue;
            }else{
                increasing = false;
                break;
            }
        }
        if(increasing){
            System.out.println("Given number is increasing");
        }else{
            System.out.println("Given number is non-increasing");

        }
    }
}
