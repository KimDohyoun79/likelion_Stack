package org.example;

public class Stack01 {

    int[] arr = new int[10000];
    int pointer = 0;
    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public int[] push(int value){
        this.arr[this.pointer++] = value;
        return arr;
    }

    public int pop(){
        return this.arr[--this.pointer];
    }

    public int[] getArr(){
        return this.arr;
    }
}

