package com.asiainfo.stock;

import java.lang.reflect.Array;
import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        System.out.println("请出入您要查询的字符串: ");
        Scanner scan = new Scanner(System.in);
        String string=scan.next();
        System.out.println("您输入的字符串为: "+string);
        int i;
        for(i=0;i<string.length();i++){
            Array[] array=new Array[string.length()];
        }
        System.out.println(i);
    }
}
