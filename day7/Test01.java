public class Test01{
    public static void main(String[] args){
        int sum =0;
        for(int i=0;i<100;i++){
            if(i%2==1){
                sum +=i;
            }
        }
        char da = 'A';
        char xiao = 'a';
        for (int i=0;i<26;i++){
            System.out.println(da+"  "+xiao);
            da++;
            xiao++;
        }
        System.out.println(sum);
    }
}