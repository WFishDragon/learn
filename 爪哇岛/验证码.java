package test;

import java.util.Random;

public class 验证码 {
    public static void main(String[] args) {
        //定义方法实现随机产生一个5位的验证码
        //验证码格式：
        // 长度为5
	    //前四位是大写字母或者小写字母
        //最后一位是数字
        securityCode();
    }
    public static void securityCode(){
        Random r = new Random();
        for(int i=0;i<4;i++){
            int a=r.nextInt(26)+65;
            System.out.print((char)a);
        }
        int b = r.nextInt(10);
        System.out.println(b);
    }
}
