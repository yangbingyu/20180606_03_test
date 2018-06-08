import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test3 {
    public static void main(String[] args) {
        int[] ages=new int[10];
        Scanner scanner=new Scanner(System.in);
        int i=0;
        for (i=0;i<10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄：");
        ages[i]=scanner.nextInt();
        }
        double j=0;
        double s=0;
        for(i=0;i<10;i++) {
            if (ages[i] > 30) {
                j += 1;
            } else {
                s += 1;
            }
        }
        System.out.println(j+","+s);
        System.out.println("30岁以下的比例是："+(s*10.0)+"%");
        System.out.println("30岁以上的比例是："+(j*10.0)+"%");
    }
}
