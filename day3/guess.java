import java.util.Random;
import java.util.Scanner;

public class guess{
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
// create random num
        int randomNum = r.nextInt(100);
        System.out.println("������Ѿ�����");
//input the number
        System.out.println("---������²������---");
        int enterNum = sc.nextInt();

//while loop ,according the result ,give hint
        while(enterNum != randomNum){
            if(enterNum > randomNum){
                System.out.println("��µıȽϴ�");
            }else{
                System.out.println("��µ�С��");
            }
            System.out.println("---������²������---");
            enterNum = sc.nextInt();            
        }
        System.out.println("bingo");
    }
}