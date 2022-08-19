package test;

public class test7 {
    public static void main(String[] args) {
        //珠穆朗玛峰高为8844430毫米，假如有一张足够大的纸厚度为0.1毫米，折叠多少次为珠穆朗玛峰的高度
        int i;
        double a = 0.1;
        for (i = 0; i < 100; i++) {
            if (a > 8844430) {
                break;
            }
            a *= 2;
        }
        System.out.println(i);
    }
}
