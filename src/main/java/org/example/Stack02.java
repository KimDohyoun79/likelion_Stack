package org.example;

public class Stack02 {

    int[] arr;
    int top = 0;
    public Stack02() {
        arr = new int[10000];
    }

    public Stack02(int size) {
        this.arr = new int[size];
    }

    public int[] push(int value){
        this.arr[this.top++] = value;
        return arr;
    }

    public int pop(){
        return this.arr[--this.top];
    }

    public int[] getArr(){
        return this.arr;
    }
}

