import java.util.Scanner;
import java.util.Random;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int num = r.nextInt(50);
        double d = r.nextDouble();

        System.out.println(num);
        System.out.println(d);

        int st = sc.nextInt();
        System.out.print("your input is " + st);
    }
}