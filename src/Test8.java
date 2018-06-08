import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入1-10之间的整数：");
        int num=scanner.nextInt();
        int a=1;
        System.out.print(num+"!=");
        for (int i=1;i<=num;i++){
            a*=i;
            System.out.print(i+(i==num?"=":"*"));
            if(num<1||num>10){
                System.out.println("数据无效，结束程序！");
                break;
            }
        }
        System.out.println(a);
    }
}
