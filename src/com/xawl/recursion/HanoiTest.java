package com.xawl.recursion;

/**
 * Author: 齐烟九点天踦爵
 * Time: 2020/3/12 10:59
 * Description:经典的递归问题：汉诺塔
 */
public class HanoiTest {
    public static void main(String[] args) {
        hanoi(2,'a','b','c');
    }
    /**
     * 该函数用于将from的盘子移动到to
     * @Date  2020/3/12 11:00
     * @param n     共有几个盘子
     * @param from  开始的柱子
     * @param in    中间的柱子
     * @param to    目标柱子
     * @return void
     */
    public static void hanoi(int n,char from,char in,char to){
        if(n==1){
            System.out.println("第1个盘子从"+from+"移动到"+to);
        }else{
            hanoi(n-1,from,to,in);
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            hanoi(n-1,in,from,to);
        }
    }
}
