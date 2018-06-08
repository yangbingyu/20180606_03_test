/**
 * Created by dell on 2018/6/6.
 */
public class Test1 {

        public static void main(String[ ] args) {
            int val = 12345;
            int r_digit;
            System.out.print("反转后的整数是：");
            while(val/10>0){
                int num=val%10;
                System.out.print(num);
                val/=10;
                if (val<10){
                    System.out.print(val);
                }
            }
        }

}
