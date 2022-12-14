package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Stack01Test {

        @Test
        @DisplayName("push")
        void pushTest(){
            Stack01 stack01 = new Stack01();
            stack01.push(10);
            stack01.push(20);

            int[] arr = stack01.getArr();

            Assertions.assertEquals(10, arr[0]);
            Assertions.assertEquals(20, arr[1]);
        }


        @Test
        @DisplayName("pop")
        void pushAndPop(){
            Stack01 stack01 = new Stack01();
            stack01.push(10);
            stack01.push(20);


            Assertions.assertEquals(20, stack01.pop());
            Assertions.assertEquals(10, stack01.pop());
        }

}
