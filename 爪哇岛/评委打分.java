package test;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        //选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，
        //请完成上述过程并计算出选手的得分。
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        //存储数据
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的分数，分数范围[0~100]：");
            arr[i] = sc.nextInt();
        }
        //计算最大最小值
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < 6; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        //删除最大最小值
        for (int i = 0; i < 6; i++) {
            if (max == arr[i]) {
                arr[i] = 0;
                break;
            }
        }
        for (int i = 0; i < 6; i++) {
           if (min == arr[i]) {
               arr[i] = 0;
               break;
           }
        }
        //计算平均数
        int num = 0;
        for (int i = 0; i < 6; i++) {
            num += arr[i];
        }
        System.out.println(num/4);
    }
}
