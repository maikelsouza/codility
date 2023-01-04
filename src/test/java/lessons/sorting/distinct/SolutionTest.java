package lessons.sorting.distinct;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void whenExistOneElementDistinct() {
        int[] array = {1, 1, 1};

        int result = new Solution().solution(array);

        assertEquals(result,1);
    }

    @Test
    void whenExistTwoElementsDistinct() {
        int[] array = {2, 1, 1, 2, 1};

        int result = new Solution().solution(array);

        assertEquals(result,2);
    }

    @Test
    void whenExistThreeElementsDistinct() {
        int[] array = {2, 1, 1, 2, 3 ,1};

        int result = new Solution().solution(array);

        assertEquals(result,3);
    }


}