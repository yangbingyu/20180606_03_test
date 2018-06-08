/**
 * Created by dell on 2018/6/6.
 */
public class Test9 {
    public static void main(String[] args) {
        int j=0;
        for (int i=1;i<=1000;i++){
            if(i%5==0){
                System.out.print(i+"\t");
                j++;
                if (j%8==0){
                    System.out.println();
                }
            }else {
                continue;
            }
        }
        System.out.println("1-1000之间5的倍数总共是："+j);
    }
}
