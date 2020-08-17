package com.warrior;

import java.util.Scanner;

//实现两个变量的互换，不借助第3个变量，借助异或运算，目前测试了整型
public class Ex018 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入变量A：");
        long A = console.nextLong();
        System.out.println("请输入变量B：");
        long B = console.nextLong();

        System.out.println("A:"+A+" B:"+B);
        System.out.println("执行变换操作");
        A = A^B;
        B = A^B;
        A = A^B;
        System.out.println("A:"+A+" B:"+B);
    }
}
