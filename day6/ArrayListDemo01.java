import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo01{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("stu1");
        list.add("stu2");
        list.add("stu3");
        list.add("stu4");

        //get the total count
        System.out.println("length:" + list.size());
        list.add("stu5");
        System.out.println("length:" + list.size());
        int a = 2;
        list.remove(a);
        System.out.println("length:" + list.size());
        
        //get the sp number element
        // System.out.println("want to see whitch position");
        // int num = new Scanner(System.in).nextInt();
        // System.out.println("the"+num+"position's num is "+list.get(num));
    }
}