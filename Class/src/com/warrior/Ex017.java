package com.warrior;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        long input;
        long output;
        Scanner console = new Scanner(System.in);

        System.out.println("请输入一个数字：");
        input = console.nextLong();
        System.out.println("您输入的数字是："+input);
        System.out.println("该数字乘以4："+(input<<2));
        System.out.println("该数字乘以16："+(input<<4));
    }
}
