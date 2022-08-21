package test;
public class 打印素数 {
    public static void main(String[] args) {
        //判断101~200之间有多少个素数，并输出所有素数。
        //备注：素数就是质数
        for(int i=101;i<200;i++){
            prime(i);
        }
    }
    public static void prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return;
            }
        }
        System.out.println(n);
    }
}
