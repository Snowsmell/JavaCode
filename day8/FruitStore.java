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
        item.Id = 9001;
        item.price = 120;

        FruitItem item2 = new FruitItem();
        item2.name = "�п�����ĵ����";
        item2.Id = 9002;
        item2.price = 20;

        FruitItem item3 = new FruitItem();
        item3.name = "�½�ԭ�����ܹ�";
        item3.Id = 9003;
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
    public static void chooseFunction(Arraylist<FruitIten> list){
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
                System.out.println("��Ч���룬������ѡ��")
                break;
        }
    }
}