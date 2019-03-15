package com.asiainfo.stock;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 字符串中只包含小写英文字母，
 * 统计每种字符出现的次数
 * n a是97，b是98
 * n a-a 是0, b-a是1，z-a是25，当下标用
 * n 创建26个长度的int数组
 */
public class wordCount {
    public static void main(String[] args) {
        System.out.println(">>>请出入您要查询的字符串: ");
        Scanner scan = new Scanner(System.in);
        String string=scan.next();
        System.out.println(">>>您输入的字符串为: "+string);
        char[] chars = string.toCharArray();
        char[] charsJishu=new char[26];
        int num=0;
        int[] jishu=new int[26];
        for (Character a:chars ) {
            for(int i=0;i<26;i++){
                if(a==i+97){
                    jishu[a-97]++;
                    charsJishu[i]=a;
                }
            }
        }
        for(int j=0;j<26;j++){
            if(jishu[j]>0){
                System.out.println(charsJishu[j]+"的个数: "+jishu[j]);
            }
        }
    }
}
