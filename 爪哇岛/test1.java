package test;

import java.util.Scanner;

//键盘录入一个数，求出他的个位，十位，百位
public class test1 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number =sc.nextInt();

        //2.个位，十位，百位
        /*公式：
        个位:  数字 % 10
        十位:  数字 / 10 % 10
        百位:  数字 / 10 / 10 % 10
         */
        System.out.println(number%10);
        System.out.println(number/10%10);
        System.out.println(number/100%10);
    }
}
