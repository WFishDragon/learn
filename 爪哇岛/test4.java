package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //输入两只老虎的体重判断体重是否相等
        System.out.println("请输入第一只老虎的体重：");
        Scanner sc = new Scanner(System.in);
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = sc.nextInt();

        //输出结果
        System.out.println(weight1==weight2?"相等":"不相等");

    }
}
