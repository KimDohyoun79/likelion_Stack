package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Stack02Test {

    @BeforeEach
    void setUp() {
        // ex) db에서 데이터 지우는 코드
        // ex) db에 데이터을 넣는 코드
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        int[] arr = st.getArr();

        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
    }
//
//    @Test
//    void pushAndPop(){
//
//    }
}