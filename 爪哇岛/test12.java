package test;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        //定义方法，比较两个长方体的面积
        System.out.println("请输入第一个长方形的面积：");
        Scanner sc = new Scanner(System.in);
        int mianji1 = sc.nextInt();
        System.out.println("请输入第二个长方形的面积：");
        int mianji2 = sc.nextInt();
        int result = mianji(mianji1, mianji2);
        if (result > 0) {
            System.out.println("第一个长方形的面积大于第二个");
        } else if (result == 0) {
            System.out.println("第一个长方形的面积等于第二个");
        } else {
            System.out.println("第二个长方形的面积大于第一个");
        }
    }

    public static int mianji(int mianji1, int mianji2) {
        return mianji1 - mianji2;
    }
}
