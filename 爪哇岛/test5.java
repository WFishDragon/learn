package test;

public class test5 {
    public static void main(String[] args) {
        //有三个和尚身高为150cm,165cm,210cm,求出他们的最高身高，用三元运算符

        int a = 210, b = 150, c = 165;
        int result = a > b ? a : b;
        System.out.println(result > c ? result : c);
    }
}
