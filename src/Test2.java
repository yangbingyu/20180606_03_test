import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入一个值:");
        int n=scanner.nextInt();
        for (int i=0;i<=n;i++){
            int j=n-i;
            System.out.println(i+"+"+j+"="+n);
        }
    }
}
