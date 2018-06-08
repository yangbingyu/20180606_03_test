/**
 * Created by dell on 2018/6/6.
 */
public class Test5 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i;
            if (sum>20){
                System.out.println(i);
                break;
            }
        }
    }
}
