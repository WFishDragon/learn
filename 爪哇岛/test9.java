package test;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        //键盘录入一个正整数，判断是否为质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();
        int i;
        boolean flag=true;
        for(i=2;i<number;i++){
            if(number%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("该数"+number + "是一个质数");
        }else{
            System.out.println("该数"+number + "不是一个质数");
        }
    }
}
