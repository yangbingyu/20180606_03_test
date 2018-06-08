import java.util.Scanner;

/**
 * Created by dell on 2018/6/6.
 */
public class Test10 {
    public static void main(String[] args) {
        int[] score = new int[10];
        int sum = 0;
        int ave = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "名学员的JAVA成绩：");
            score[i] = scanner.nextInt();
            if (score[i] < 0 || score[i] > 100) {
                System.out.println("成绩无效");
                break;
            }
            sum += score[i];
        }
        ave = sum / 10;
        if (ave >= 90 && ave <= 100) {
            System.out.println("该班学员的等级为：A");
        } else if (ave >= 80 && ave <= 89) {
            System.out.println("该班学员的等级为：B");
        } else if (ave >= 70 && ave <= 79) {
            System.out.println("该班学员的等级为：C");
        } else if (ave >= 60 && ave <= 69) {
            System.out.println("该班学员的等级为：D");
        }else if (ave < 60) {
            System.out.println("该班学员的等级为：E");
        }
    }
}
