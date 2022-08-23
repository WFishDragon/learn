package test;

import java.util.Random;

public class 抽奖 {
    public static void main(String[] args) {
        //一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        //请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        //打印效果如下：（随机顺序，不一定是下面的顺序）
        //888元的奖金被抽出
        //588元的奖金被抽出
        //10000元的奖金被抽出
        //1000元的奖金被抽出
        //2元的奖金被抽出
        int[] money = {2,588,888,1000,10000};
        Random ran = new Random();
        boolean flag=true;
        while (flag){
            int subscript = ran.nextInt(5);
            if(money[subscript]==0){
                continue;
            }
            System.out.println(money[subscript]+"元的奖金被抽出");
            money[subscript]=0;
            if(money[0]==0&&money[1]==0&&money[2]==0&&money[3]==0&&money[4]==0){
                break;
            }
        }
    }
}
