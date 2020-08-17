package com.warrior;

public class tmp {
    public static void main(String[] args) {
        char[] ch = new char[100];
        for(int i=0;i<ch.length;i++) {
            ch[i] = (char)(i+65);
        }
        System.out.println(new String(ch));
    }
}
