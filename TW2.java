import java.util.Scanner;

public class TW2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        int b = scn.nextInt();
        System.out.println(Math.round(a*Math.pow(10,b))/Math.pow(10,b));
    }
}
//四捨五入取得小數點後第n位
