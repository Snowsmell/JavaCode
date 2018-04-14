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
        item.ID = 9001;
        item.price = 120;

        FruitItem item2 = new FruitItem();
        item2.name = "尚康杂粮牡丹饼";
        item2.ID = 9002;
        item2.price = 20;

        FruitItem item3 = new FruitItem();
        item3.name = "新疆原产哈密瓜";
        item3.ID = 9003;
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
    public static void chooseFunction(ArrayList<FruitItem> list){
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
                System.out.println("无效输入，请重新选择");
                break;
        }
    }
    //库存货物查询
    public static void showFruitList(ArrayList<FruitItem> list) {
        System.out.println("--------------商 品 库 存-------------");
        System.out.println("商品编号\t商品名称\t\t商品单价");
        for(int i=0;i<list.size();i++){
            FruitItem item = list.get(i);
            System.out.println(item.ID + "\t" + item.name + "\t" + item.price);
        }
    }

    //添加新货物
    public static void addFruitItem(ArrayList<FruitItem> list) {
        FruitItem newItem = new FruitItem();
        Scanner sc = new Scanner(System.in);
        //提示输入信息
        System.out.println("请输入新水果名称");
        newItem.name = sc.next();
        System.out.println("请输入新水果ID");
        newItem.ID = sc.nextInt();
        System.out.println("请输入新水果价格");
        newItem.price = sc.nextDouble();       
        
        list.add(newItem);
    }

    //删除货物
    public static void delFruitItem(ArrayList<FruitItem> list) {
        System.out.println("-------请输入想要删除的水果的编号---------");
        Scanner sc = new Scanner(System.in);
        int fruitID = sc.nextInt();

        for(int i =0;i<list.size();i++){
            FruitItem thisItem = list.get(i);
            if(thisItem.ID == fruitID){
                list.remove(thisItem);
                System.out.println("水果信息删除完毕");
                return;
            }
        }
        System.out.println("未找到该水果");
    }

    //修改货物
    public static void updateFruitItem(ArrayList<FruitItem> list) {
        System.out.println("-------请输入想要修改的水果的编号---------");
        Scanner sc = new Scanner(System.in);
        int fruitID = sc.nextInt();     
        for(int i= 0;i<list.size();i++){
            FruitItem thisItem = list.get(i);
            if(thisItem.ID == fruitID){
                System.out.print("请输入新的水果ID:");
                thisItem.ID = sc.nextInt();
                System.out.print("请输入新的水果名称:");
                thisItem.name = sc.next();
                System.out.print("请输入新的水果单价:");
                thisItem.price = sc.nextDouble();
                System.out.println("水果信息更新完毕!");
                return;                    
            }
        }  
        System.out.println("没有这个编号的水果"); 
    }
}