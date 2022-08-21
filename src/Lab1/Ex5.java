package Lab1;

public class Ex5 {
    public static void main(String[] args) {
        Ex5 ob = new Ex5();
        ob.Que5(20);
    }
    public void Que5(int n){
        for(int i = 1;i <= n;i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
