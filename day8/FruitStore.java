import java.util.ArrayList;
import java.util.Scanner;
public class FruitStore{
    public static void main(String[] args){
        //定义arraylist,类型是自己定义的FruitItem类
        ArrayList<FruitItem> list = new ArrayList<FruitItem>();
        /**
         * 超市商品初始化
         */
        init(list);
        while(true){
            /**
             * 显示主菜单
             */
            mainMenu();
            /**
             * 根据接收到的功能选项，执行对应的功能
             */
            chooseFunction(list);
        }
    }

    //商品初始化，包含了3个产品 
    public static void init(ArrayList<FruitItem> list){
        FruitItem item = new FruitItem();
        item.name = "少林寺酥饼核桃";
        item.Id = 9001;
        item.price = 120;

        FruitItem item2 = new FruitItem();
        item2.name = "尚康杂粮牡丹饼";
        item2.Id = 9002;
        item2.price = 20;

        FruitItem item3 = new FruitItem();
        item3.name = "新疆原产哈密瓜";
        item3.Id = 9003;
        item3.price = 3;
        list.add(item);
        list.add(item2);
        list.add(item3);
    }

    //主菜单
    public static void mainMenu(){
        System.out.println("-------------------Welcome to my Fruit Store------------------------");
        System.out.println("1:查询货物  2：添加货物 3：删除货物 4：修改货物");
        System.out.println("5:退出系统");
    }
    //根据接收到的选项，执行功能
    public static void chooseFunction(Arraylist<FruitIten> list){
        System.out.println("请输入要操作的功能序号");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                showFruitList(list);
                break;
            case 2:
                addFruitItem(list);
                break;
            case 3:
                delFruitItem(list);
                break;
            case 4:
                updateFruitItem(list);
                break;
            case 5:
                System.out.println("退出系统");
                return;
            default:
                System.out.println("无效输入，请重新选择")
                break;
        }
    }
}