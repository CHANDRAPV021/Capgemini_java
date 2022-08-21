package Lab1;

public class Exercise2 {
    public static void main(String[] args) {
        //1 2 3 4 5 6
        //1 1 2 3 5 8
        Exercise2 obj = new Exercise2();
        obj.nonRecSolution(6);//Expected is 8
        obj.questionTwoRecursive(6);//Expected is 8
    }
    public int questionTwoRecursive (int n){
        if(n == 1 || n== 2){
            return 1;
        }
        return(questionTwoRecursive(n - 1) + questionTwoRecursive(n - 2));
    }
    public void nonRecSolution(int n){
        int k = 100;
        int[] fib = new int[k];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2;i < k ;i++){
            fib[i] = fib[i - 1] + fib[i - 2];
            //System.out.println(fib[n - 1] + fib[n - 2]);
        }
        System.out.println(n);
    }
}
