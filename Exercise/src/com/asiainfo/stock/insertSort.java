package com.asiainfo.stock;

import java.util.Arrays;
import java.util.Random;

/**
 * 插入排序
 */
public class insertSort {
    public static void main(String[] args) {
        int[] array=init();
        System.out.println("排序前的数组: "+Arrays.toString(array)+"\n");
        array=sortArray(array);
        System.out.println("排序后的数组: "+Arrays.toString(array)+"\n");
    }

    /**
     * 插入排序
     * @param array
     * @return
     */
    private static int[] sortArray(int[] array) {
        //5,2,7,4,8
        for(int i=1;i<array.length;i++){//下标1,2,3,4分别插入到有序序列,第一个数字默认有序,需要4轮
            for(int j=i-1;j>=0;j--){//下标j+1分别和下标0,1,2...j比较
                if(array[j]>array[j+1]){//如果下标j大于下标j+1,交换
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    /**
     * 生成一个长度随机的数组
     * @return 数组
     */
    private static int[] init() {
        int length=5+new Random().nextInt(15);
        System.out.println("数组长度: "+length+"\n");
        int[] array = new int[length];
        for(int i=0;i<array.length;i++){
            array[i] = new Random().nextInt(100);
        }
        return array;
    }
}
