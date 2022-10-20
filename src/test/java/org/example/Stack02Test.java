package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Stack02Test {
    Stack02 st = new Stack02();
    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        int[] arr = st.getArr();

        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
    }

    @Test
    void Pop(){
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

    }
}