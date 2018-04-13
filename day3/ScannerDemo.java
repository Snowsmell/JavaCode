import java.util.Scanner;
public class ScannerDemo{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//��ȡ����
		System.out.println("������һ������");
		int n = sc.nextInt();
		System.out.println("n��ֵΪ" + n);
		System.out.println("������һ���ַ���");
		String str = sc.next();
		System.out.println("str��ֵΪ" + str);
    }
}
