import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("请输入会员号（<4位整数>）");
            int vipno = scanner.nextInt();
            if(vipno>9999||vipno<1000){
                System.out.println("会员号不合法，录入失败！");
                break;
            }
            System.out.println("请输入会员生日（月/日<用两位整数表示>）");
            int month = scanner.nextInt();
            int day=scanner.nextInt();
            System.out.println("请输入会员积分：");
            int vipscore=scanner.nextInt();
            System.out.println("您录入的会员信息是：");
            System.out.println(vipno+"\t"+month+"/"+day+"\t"+vipscore);
        }
        System.out.println("程序结束！");
    }
}
