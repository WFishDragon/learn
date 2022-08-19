package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //键盘录入两个整数，当一个数为6时输出true,当两个数的和为6的倍数也输出true
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        if (a+b!=0)
        {
            System.out.println(a==6||b==6||(a+b)%6==0);
        }
        System.out.println(false);
    }
}
