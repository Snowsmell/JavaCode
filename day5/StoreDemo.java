/**
 *?????????? 
 */
import java.util.Scanner;
public class StoreDemo {    
    //??????
    public static void main(String[] args){
        //????????????
        String[] brands = {"MacBookAir","ThinkpadT450"};
        double[] sizes ={13.3,14.0};
        double[] prices = {6988.88,5999.99};
        int[] count = {5,6};
        while(true){
            int choose = chooseFunction();
            switch (choose) {
                case 1:
                    printStore(brands,sizes,prices,count);
                    break;
                case 2:
                    update(brands,count);
                case 3:
                    return;
                default:
                    System.out.println("-------------------");
                    System.out.println("?????????????????????????");
                    break;
            }
        }
    }    
    //???????
    public static int chooseFunction(){
        System.out.println("-------??????-------");
        System.out.println("1.??????çÀ");
        System.out.println("2.?????????????");
        System.out.println("3.???");
        System.out.println("?????????ß÷???????");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        return choose;
    }    
    //??????????????
    public static void printStore(String[] brands,double[] sizes,double[] prices, int[] count){
        System.out.println("---------???????çÀ-----------");
        System.out.println("??????      ???      ???      ???????");
        int totalCount = 0;
        double totalMoney = 0;
        for(int i=0;i<brands.length;i++){
            System.out.println(brands[i]+"    "+sizes[i]+"     "+prices[i]+"     "+count[i]);
            totalCount += count[i];
            totalMoney += count[i]*prices[i];
        }
        System.out.println("????????"+ totalCount);
        System.out.println("??????????"+ totalMoney);
    }

    //???????????
    public static void update(String[] brands,int[] count){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<brands.length;i++){
            System.out.println("?????????"+brands[i]+"??????");
            int newCount = sc.nextInt();
            count[i] = newCount;
        }
    }
}