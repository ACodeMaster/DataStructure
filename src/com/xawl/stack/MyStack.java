package com.xawl.stack;

/**
 * Author: 齐烟九点天踦爵
 * Time: 2020/3/10 20:44
 * Description:栈可以使用数组实现
 */
public class MyStack<E> {
    private static Object[] elementData;
    private int elementCount;
    public MyStack(){
    }
    public E push(E e){
        if(elementData==null){
            elementData = new Object[16];
            elementData[0]=e;
            elementCount++;
            return e;
        }
        elementData[elementCount++]=e;
        return e;
    }
    public E pop(){
        return (E) elementData[elementCount-1];
    }
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("nihao");
        System.out.println(stack.pop());
    }
}
