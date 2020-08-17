package com.warrior;

import java.util.Scanner;

//判断某一年是否是闰年
public class Ex019 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year;
        try {
            year = console.nextLong();
            if(year%4==0&&year%100!=0||year%400==0) {
                System.out.println(year+"是润年");
            }else {
                System.out.println(year+"不是闰年");
            }
        }catch (Exception e) {
            System.out.println("您输入的的不是有效年份！");
        }
        if("ni"=="nii") {
            System.out.println("y");
        }
    }
}
