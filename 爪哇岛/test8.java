package test;

public class test8 {
    public static void main(String[] args) {
        //打印0~100，满足七的倍数打印过
        int i, a;
        for (i = 0, a = 0; i < 100; i++) {
            if (a != 0 && a % 7 == 0) {
                System.out.println("过");
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
