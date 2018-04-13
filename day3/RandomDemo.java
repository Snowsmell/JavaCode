import java.util.Random;
public class RandomDemo{
    public static void main(String[] args){
        Random r = new Random();
        //0-100????
        int i = r.nextInt(100);
        //0-1§³??
        double d = r.nextDouble();
        System.out.println(i);
        System.out.println(d);
    }
}