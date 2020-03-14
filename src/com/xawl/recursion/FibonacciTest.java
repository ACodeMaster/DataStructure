package com.xawl.recursion;

/**
 * Author: 齐烟九点天踦爵
 * Time: 2020/3/12 10:30
 * Description:经典的递归问题：斐波那契数列  1 1 2 3 5 8....
 */
public class FibonacciTest {
    //获取第i项的斐波那契数列的值，从1开始
    public static int getFibonacci(int i){
        if(i==1 | i==2){
            return 1;
        }else{
            return getFibonacci(i-1)+getFibonacci(i-2);
        }
    }

    public static void main(String[] args) {
        //System.out.println(getFibonacci(6));
        for(int i=0;i<10;i++){
            System.out.println("第"+(i+1)+"的值是："+getFibonacci(i+1));
        }
    }
}
