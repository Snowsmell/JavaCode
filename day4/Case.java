import java.util.Scanner;
import java.util.Random;
public class Case{
    public static void main(String[] args){
        System.out.println("-------call your name--------");
        String[] students = new String[3];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<students.length;i++){
            students[i] = sc.next();
        }
        for(int i=0;i<students.length;i++){
            // String name = students[i];
            System.out.println("No."+i+"students name i " + students[i]);
        }

        int rn = new Random().nextInt(students.length);
        String name = students[rn];
        System.out.println("the lucky boy is "+name);
    }
}