public class Demo{
	public static void main(String[] args){
		//mac笔记�
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		int macCount = 10;

		//联想Thinkpad笔记本电�
		String thinkpadBrand = "ThinkpadT450";
		double thinkpadSize = 14.0;
		double thinkpadPrice = 5999.99;
		int thinkpadCount = 10;

		//华硕ASUS笔记本电�
		String ASUSBrand = "ASUS-FL5800";
		double ASUSSize = 15.6;
		double ASUSPrice = 4999.50;
		int ASUSCount = 18;

		int totalCount = macCount+thinkpadCount+ ASUSCount;
		double totalPrice=(macCount * macPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);
		System.out.println("------------------------------ �̳����list ------------------------------");
		System.out.println("Ʒ���ͺ�	�ߴ�	�۸�	�����");
		System.out.println(macBrand+"	"+macSize+"	"+macPrice+"	"+macCount);
		System.out.println(thinkpadBrand+"	"+thinkpadSize+"	"+thinkpadPrice+"	"+thinkpadCount);
		System.out.println(ASUSBrand+"	"+ASUSSize+"	"+ASUSPrice+"	"+ASUSCount);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("�ܿ����"+totalCount); 
		System.out.println("�ܼ۸�"+totalPrice);

	}
}
