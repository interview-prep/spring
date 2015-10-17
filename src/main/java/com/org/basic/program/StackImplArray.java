package com.org.basic.program;

/**
 * Created by SMALA on 10/17/2015.
 */
public class StackImplArray {

    private int MAX_LIMIT = 5;
    private int[] stack = new int[MAX_LIMIT];
    private int top = -1;


    private int push(int value) {

        if (!isFull()) {
            stack[++top] = value;
        } else {
            System.out.println("Stack is full");
            System.out.println("==============================================");
            return 9999;
        }
        return stack[top];
    }

    private int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty : " + top);
            System.out.println("==============================================");
            return -1;
        }

    }

    public boolean isFull() {
        return top == MAX_LIMIT - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private int[] allElements() {
        return stack;
    }

    public static void main(String s[]) {

        StackImplArray array = new StackImplArray();
        System.out.println("Pushed Elements ");
        System.out.println("----------------------------------");
        System.out.println(array.push(100));
        System.out.println(array.push(101));
        System.out.println(array.push(102));
        System.out.println(array.push(103));
        System.out.println(array.push(104));
        System.out.println(array.push(105));
        System.out.println("----------------------------------");
        System.out.println("Popped Elements ");
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println(array.pop());
        System.out.println("----------------------------------");


    // TODO:
        int[] ints = array.allElements();
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
