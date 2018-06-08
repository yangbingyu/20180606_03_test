import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.print("请输入用户名：");
            String name=scanner.next();
            System.out.print("请输入密码：");
            String pwd=scanner.next();
            if(name.equals("jim")&&pwd.equals("123456")){
                System.out.println("欢迎登陆MyShopping系统");
                break;
            }else{
                System.out.println("输入错误！您还有"+(3-i)+"次机会");
            }
            if(3-i==0){
                System.out.println("对不起，您3次均输入错误");
                break;
            }
        }
    }
}
