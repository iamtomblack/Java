package com.warrior;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String password = console.nextLine();
        char[] arry = password.toCharArray();

        for(int i=0;i< arry.length;i++) {
            arry[i] = (char)(arry[i]^20000);
        }

        System.out.println("加密或解密结果如下：");
        System.out.println(new String(arry));
    }
}
