package com.warrior;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        Long num = console.nextLong();

        String check = num%2==0?num+"是一个偶数":num+"是一个奇数";
        System.out.println(check);
    }
}
