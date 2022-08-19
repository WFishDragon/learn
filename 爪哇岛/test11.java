package test;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        //定义一个方法，求一个长方形的周长
        System.out.println("请输入长方形的长：");
        Scanner sc = new Scanner(System.in);        //定义一个类
        int chang = sc.nextInt();
        System.out.println("请输入长方形的宽：");
        int kuan = sc.nextInt();
        zhouchang(chang,kuan);
    }
    public static void zhouchang(int chang,int kuan) {
        int result = (chang+kuan)*2;
        System.out.println("长方形的周长为"+result);
    }
}
