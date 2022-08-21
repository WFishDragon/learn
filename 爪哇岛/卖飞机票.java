package test;

import java.util.Scanner;

public class 卖飞机票 {
    public static void main(String[] args) {
        //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        //按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        System.out.println("输入机票原价钱：");
        Scanner sc= new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println("输入月份：");
        int month = sc.nextInt();
        System.out.println("输入头等舱(1)或经济舱(2):");
        int cabin = sc.nextInt();
        calculate(money,month,cabin);
    }
    public static void calculate(int money,int month,int cabin){
        if (month >= 5 && month <= 10) {
            switch (cabin) {
                case 1:
                    System.out.println("您打折后的机票为:" + (int)(money * 0.9));
                    break;
                case 2:
                    System.out.println("您打折后的机票为:" + (int)(money * 0.85));
                    break;
                default:
                    System.out.println("请输入正确的舱位数字1或者2");
                    break;
            }
        }
        if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {
            switch (cabin) {
                case 1:
                    System.out.println("您打折后的机票为:" + money * 0.7);
                    break;
                case 2:
                    System.out.println("您打折后的机票为:" + money * 0.65);
                    break;
                default:
                    System.out.println("请输入正确的舱位数字1或者2");
                    break;
            }
        }
    }
}
