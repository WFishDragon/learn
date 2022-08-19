package test;
//导包，创建对象，读取数据

import java.util.Random;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //取到随机数1~100
        Random r = new Random();
        int number = r.nextInt(100) + 1;//0~100
        //猜随机数
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你猜的数字");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else if (guessNumber == number) {
                System.out.println("猜对了");
                System.out.println(number);
                break;
            }
        }
    }
}
