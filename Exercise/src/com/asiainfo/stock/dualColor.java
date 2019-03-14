package com.asiainfo.stock;

import java.util.Arrays;
import java.util.Random;

public class dualColor {
    public static void main(String[] args){
        //初始化红色球
        int[] a=init(33);
        int lengthRed=a.length;
        //初始化蓝色球
        int[] b=init(16);
        int lengthBlue=b.length;
        //随机选择6个红球
        int[] redBalls=chooseRed(a,lengthRed);
        //随机选择1个蓝色球
        int blueBall=chooseBlue(b,lengthBlue);
        String s = Arrays.toString(redBalls);
        System.out.println("您选择的号码为:\n红色球:"+s+"\n蓝色球:"+blueBall+"\n祝您中大奖!!!");
    }

    /**
     * 选择蓝色球
     * @param b
     * @param length
     * @return 蓝色球
     */
    private static int chooseBlue(int[] b, int length) {
        return b[new Random().nextInt(length)];
    }

    /**
     * 选择红色球
     * @param a
     * @param lengthRed
     * @return 红色球数组
     */
    private static int[] chooseRed(int[] a, int lengthRed) {
        //初始化红色球数组
        int[] redBalls=new int[6];
        //定义标记
        boolean[] flag=new boolean[lengthRed];
        //先选一个号,然后判断是否重复
        for (int i=0;i<6;i++){
            int j;
            do {
                j=new Random().nextInt(lengthRed);
            }while (flag[j]);
            redBalls[i]=a[j];
            flag[j]=true;
        }
        return redBalls;
    }

    /**
     * 初始化一个数据
     * @param 数组个数
     * @return 数据
     */
    private static int[] init(int m) {
        int[] a=new int[m];
        for (int i=0;i<a.length;i++){
            a[i]=i+1;
        }
        return a;
    }
}
