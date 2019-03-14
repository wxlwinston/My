package com.asiainfo.stock;

import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序
 */
public class bubbleSort {
    public static void main(String[] args) {
        //生成随机数组
        int[] array=init();
        System.out.println("排序前的数组: "+ Arrays.toString(array)+"\n");
        array=bubSort(array);
        System.out.println("排序后的数组: "+ Arrays.toString(array)+"\n");
    }

    /**
     * 冒泡排序
     * @param array
     * @return
     */
    private static int[] bubSort(int[] array) {
        //4,7,2,3,8
        for(int i=1;i<array.length;i++){//比较数组长度-1轮
            for(int j=array.length-1;j>=i;j--){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return array;
    }

    /**
     * 生成随机长度的数组
     * @return
     */
    private static int[] init() {
        int length=5+new Random().nextInt(1);//指定数组长度
        System.out.println("数组长度: "+length+"\n");
        int[] array=new int[length];
        for(int i=0;i<array.length;i++){
            array[i]=new Random().nextInt(100);
        }
        return array;
    }
}
