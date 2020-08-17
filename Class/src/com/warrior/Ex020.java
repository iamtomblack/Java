package com.warrior;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入登录名：");
        String UserName = console.nextLine();
        System.out.println("请输入登录密码：");
        String Password = console.nextLine();

        if(!UserName.equals("tomblack")) {
            System.out.println("用户名非法。");
        }else if(!Password.equals("zheshimima")) {
            System.out.println("密码非法。");
        }else {
            System.out.println("登录成功！！");
        }
    }
}
