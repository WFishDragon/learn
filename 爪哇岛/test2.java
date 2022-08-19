package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //1.键盘录入两个整数代表衣服时髦度
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入我们衣服的时髦度：");
        int myFashion=sc.nextInt();
        System.out.println("请输入相亲对象衣服的时髦度：");
        int youFashion=sc.nextInt();

        //2.把两个衣服的时髦度进行比较
        boolean result = myFashion > youFashion;

        //3.打印结果
        System.out.println(result);
    }
}
