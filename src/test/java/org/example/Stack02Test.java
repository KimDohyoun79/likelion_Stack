package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void isEnpty(){
        Stack02 stt = new Stack02();
        assertTrue(stt.isEmpty());
        stt.push(10);
        assertFalse(stt.isEmpty());
        stt.pop();
        assertTrue(stt.isEmpty());
    }

    @Test
    void peek(){
        Stack02 stt = new Stack02();
        stt.push(10);
        assertEquals(10, stt.peek());
    }
}