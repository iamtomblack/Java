package com.warrior;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入员工姓名：");
        String name = console.nextLine();
        System.out.println("员工应聘的编程语言：");
        String language = console.nextLine();

        switch (language.hashCode()) {
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工"+name+"被分配到Java部门。");
                break;
            case 3104:
            case 2112:
                System.out.println("员工"+name+"被分配到C#部门。");
                break;
            default:
                System.out.println("你是怎么被招聘进来的");
        }
    }
}
