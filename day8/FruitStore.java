import java.util.ArrayList;
import java.util.Scanner;
public class FruitStore{
    public static void main(String[] args){
        //����arraylist,�������Լ������FruitItem��
        ArrayList<FruitItem> list = new ArrayList<FruitItem>();
        /**
         * ������Ʒ��ʼ��
         */
        init(list);
        while(true){
            /**
             * ��ʾ���˵�
             */
            mainMenu();
            /**
             * ���ݽ��յ��Ĺ���ѡ�ִ�ж�Ӧ�Ĺ���
             */
            chooseFunction(list);
        }
    }

    //��Ʒ��ʼ����������3����Ʒ 
    public static void init(ArrayList<FruitItem> list){
        FruitItem item = new FruitItem();
        item.name = "�������ֱ�����";
        item.ID = 9001;
        item.price = 120;

        FruitItem item2 = new FruitItem();
        item2.name = "�п�����ĵ����";
        item2.ID = 9002;
        item2.price = 20;

        FruitItem item3 = new FruitItem();
        item3.name = "�½�ԭ�����ܹ�";
        item3.ID = 9003;
        item3.price = 3;
        list.add(item);
        list.add(item2);
        list.add(item3);
    }

    //���˵�
    public static void mainMenu(){
        System.out.println("-------------------Welcome to my Fruit Store------------------------");
        System.out.println("1:��ѯ����  2����ӻ��� 3��ɾ������ 4���޸Ļ���");
        System.out.println("5:�˳�ϵͳ");
    }
    //���ݽ��յ���ѡ�ִ�й���
    public static void chooseFunction(ArrayList<FruitItem> list){
        System.out.println("������Ҫ�����Ĺ������");
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
                System.out.println("�˳�ϵͳ");
                return;
            default:
                System.out.println("��Ч���룬������ѡ��");
                break;
        }
    }
    //�������ѯ
    public static void showFruitList(ArrayList<FruitItem> list) {
        System.out.println("--------------�� Ʒ �� ��-------------");
        System.out.println("��Ʒ���\t��Ʒ����\t\t��Ʒ����");
        for(int i=0;i<list.size();i++){
            FruitItem item = list.get(i);
            System.out.println(item.ID + "\t" + item.name + "\t" + item.price);
        }
    }

    //����»���
    public static void addFruitItem(ArrayList<FruitItem> list) {
        FruitItem newItem = new FruitItem();
        Scanner sc = new Scanner(System.in);
        //��ʾ������Ϣ
        System.out.println("��������ˮ������");
        newItem.name = sc.next();
        System.out.println("��������ˮ��ID");
        newItem.ID = sc.nextInt();
        System.out.println("��������ˮ���۸�");
        newItem.price = sc.nextDouble();       
        
        list.add(newItem);
    }

    //ɾ������
    public static void delFruitItem(ArrayList<FruitItem> list) {
        System.out.println("-------��������Ҫɾ����ˮ���ı��---------");
        Scanner sc = new Scanner(System.in);
        int fruitID = sc.nextInt();

        for(int i =0;i<list.size();i++){
            FruitItem thisItem = list.get(i);
            if(thisItem.ID == fruitID){
                list.remove(thisItem);
                System.out.println("ˮ����Ϣɾ�����");
                return;
            }
        }
        System.out.println("δ�ҵ���ˮ��");
    }

    //�޸Ļ���
    public static void updateFruitItem(ArrayList<FruitItem> list) {
        System.out.println("-------��������Ҫ�޸ĵ�ˮ���ı��---------");
        Scanner sc = new Scanner(System.in);
        int fruitID = sc.nextInt();     
        for(int i= 0;i<list.size();i++){
            FruitItem thisItem = list.get(i);
            if(thisItem.ID == fruitID){
                System.out.print("�������µ�ˮ��ID:");
                thisItem.ID = sc.nextInt();
                System.out.print("�������µ�ˮ������:");
                thisItem.name = sc.next();
                System.out.print("�������µ�ˮ������:");
                thisItem.price = sc.nextDouble();
                System.out.println("ˮ����Ϣ�������!");
                return;                    
            }
        }  
        System.out.println("û�������ŵ�ˮ��"); 
    }
}