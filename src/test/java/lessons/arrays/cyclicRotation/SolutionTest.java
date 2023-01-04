package lessons.arrays.cyclicRotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {



    @Test
    void whenRotateOneTimes() {
        int[] array = {3, 8, 9, 7, 6};
        int[] arrayExpected = {6, 3, 8, 9, 7};

        var result = new Solution().solution(array,1);

        assertArrayEquals(result,arrayExpected);
    }

    @Test
    void whenRotateTwoTimes() {
        int[] array = {3, 8, 9, 7, 6};
        int[] arrayExpected = {7, 6, 3, 8, 9};

        var result = new Solution().solution(array,2);

        assertArrayEquals(result,arrayExpected);
    }

    @Test
    void whenRotateThreeTimes() {
        int[] array = {3, 8, 9, 7, 6};
        int[] arrayExpected = {9, 7, 6, 3, 8};

        var result = new Solution().solution(array,3);

        assertArrayEquals(result,arrayExpected);
    }

    @Test
    void whenArrayZero(){
        int[] array = {0, 0, 0};
        int[] arrayExpected = {0, 0 ,0};

        var result = new Solution().solution(array,4);

        assertArrayEquals(result,arrayExpected);
    }

    @Test
    void whenArrayIsEmpty() {
        int[] array = new int[0];
        int[] arrayExpected = new int[0];

        var result = new Solution().solution(array,1);

        assertArrayEquals(result,arrayExpected);
    }

    @Test
    void whenNumberRotateIsEqualsNumberElements(){
        int[] array = {1, 2, 3, 4};
        int[] arrayExpected = {1, 2, 3, 4};

        var result = new Solution().solution(array,4);

        assertArrayEquals(result,arrayExpected);
    }


}