import java.util.ArrayList;
public class Text02{
    public static void main(String[] args){
        int[] arr={11,33,22,55,66};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.println("[");
        for(int i= 0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.println(arr[i]+",");
            }
        }
    }
}