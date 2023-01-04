package lessons.countingElements.permCheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void whenIsPermutationAndNotSorted() {
        int[] array = {4, 1 ,3 ,2};

        int result = new Solution().solution(array);

        assertEquals(result,1);
    }

    @Test
    void whenIsNotPermutationAndNotSorted() {
        int[] array = {4, 1 ,2};

        int result = new Solution().solution(array);

        assertEquals(result,0);
    }

    @Test
    void whenIsPermutationAndSorter() {
        int[] array = {1 ,2, 3, 4};

        int result = new Solution().solution(array);

        assertEquals(result,1);
    }

    @Test
    void whenArrayIsEmptyd() {
        int[] array = new int[0];

        int result = new Solution().solution(array);

        assertEquals(result,1);
    }

    @Test
    void whenIsNotPermutationAndSorted() {
        int[] array = {0, 1 ,4};

        int result = new Solution().solution(array);

        assertEquals(result,0);
    }
}