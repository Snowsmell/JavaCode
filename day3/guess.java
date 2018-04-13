import java.util.Random;
import java.util.Scanner;

public class guess{
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
// create random num
        int randomNum = r.nextInt(100);
        System.out.println("随机数已经生成");
//input the number
        System.out.println("---输入你猜测的数字---");
        int enterNum = sc.nextInt();

//while loop ,according the result ,give hint
        while(enterNum != randomNum){
            if(enterNum > randomNum){
                System.out.println("你猜的比较大");
            }else{
                System.out.println("你猜的小了");
            }
            System.out.println("---输入你猜测的数字---");
            enterNum = sc.nextInt();            
        }
        System.out.println("bingo");
    }
}