package com.tzl;

/**
 * 选择排序
 * Created by tzl on 2018/6/11.
 */
public class SelSorting {
    public static void main(String[] args){
        int[] arr = new int[100000];
        System.out.print("排序前的数组：");
        for (int i = 0; i<100000;i++){
            arr[i] = (int) (Math.random()*10000000);
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        int[] result = selSort(arr);

        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+"\t");
        }
}

    /**
     * 选择排序算法
     * @param arg
     * @return
     */
    public static int[] selSort(int[] arg){
        if (arg == null)
            return null;
        int[] mid = arg.clone();
        long curTime = System.currentTimeMillis();
        for (int i=0; i<mid.length-1; i++){//循环n-1次，最后一个位置不需要排列
            int k = i;
            for (int j=i+1; j<mid.length; j++){//从i+1位置开始
                if (mid[j] < mid[k]){//找出最小值的位置
                    k = j;
                }
            }
            if (i != k){//交换数据
                int temp = mid[k];
                mid[k] = mid[i];
                mid[i] = temp;
            }
        }
        double time = (System.currentTimeMillis() - curTime)/1000;
        System.out.println("用时："+ time + " s");
        return mid;
    }
}
