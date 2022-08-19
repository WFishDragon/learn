package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //输入星期数代表今天要做的事
        System.out.println("请输入今天的星期数：");
        Scanner sc=new Scanner(System.in);
        int week=sc.nextInt();
        switch (week){
            case 1:
                System.out.println("周一跑步");break;
            case 2:
                System.out.println("周二游泳");break;
            case 3:
                System.out.println("周三竞走");break;
            case 4:
                System.out.println("周四骑单车");break;
            case 5:
                System.out.println("周五打拳击");break;
            case 6:
                System.out.println("周六爬山");break;
            case 7:
                System.out.println("周日吃大餐");break;


        }
    }
}
