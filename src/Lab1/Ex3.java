package Lab1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("choose one Light : RED(R),GREEN(G),YELLOW(Y)");
        Scanner sc = new Scanner(System.in);

        String light = sc.next();
        light = light.toLowerCase();
        System.out.println(light);
        if((light.equals("r")) || light.equals("red")){
            System.out.println("STOP");
        }
        else if((light.equals("y")) || (light.equals("yellow"))){
            System.out.println("READY");
        }
        else{
            System.out.println("GO");
        }
        sc.close();
    }
}
