import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=scanner.next();
        double[] score=new double[5];
        int i=0;
        int sum=0;
        boolean flag=true;
        for (i=0;i<5;i++){
            System.out.println("请输入第"+(i+1)+"门课的成绩：");
            score[i]=scanner.nextDouble();
            sum+=score[i];
            if (score[i]<0){
                System.out.println("抱歉分数录入错误，请重新进行录入！");
                flag=false;
                break;
            }
        }
        if(flag) {
            System.out.println("平均分是：" + sum / 5);
        }

    }
}
