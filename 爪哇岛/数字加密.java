package test;

import java.util.Scanner;

public class 数字加密 {
    public static void main(String[] args) {
        //某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        //规则如下：
        //先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
        System.out.println("输入系统的数字密码：");
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int lengh = (password+"").length();
        int[] newPassword = new int[lengh];
        for(int i=0;i<lengh;i++){
            newPassword[i]= password%10;
            newPassword[i]=(newPassword[i]+5)%10;
            System.out.println(newPassword[i]);
            password= password/10;
        }
        for(int i=0;i<lengh;i++){
            System.out.print(newPassword[i]);
        }
    }
}
