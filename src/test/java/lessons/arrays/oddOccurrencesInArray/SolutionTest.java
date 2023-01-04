package lessons.arrays.oddOccurrencesInArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {


    Solution solution = new Solution();


    @Test
    public void codilityExample() {
        assertEquals(7, solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    @Test
    public void newTest() {
        assertEquals(3, solution.solution(new int[]{0, 0, 1, 1, 3}));
        assertEquals(-32, solution.solution(new int[]{-32}));
        assertEquals(1000000000, solution.solution(new int[]{1000000000}));
        assertEquals(314, solution.solution(new int[]{314, 0, 200, 0, 1000, 1000, 0, 0, 1, 1, 1, 1, 3, 3, 3, 3, 4, 4, 5, 5, 3, 3, 1, 1, 0, 0, 0, 0, 0, 0, 200}));
        assertEquals(9, solution.solution(new int[]{1, 3, 5, 5, 3, 1, 8, 7, 1, 7, 1, 9, 8}));
    }

    @Test
    public void firstElement() {
        assertEquals(9, solution.solution(new int[]{100, 300, 500, 500, 300, 100, 800, 70, 1000, 70, 1000, 9, 800}));
    }

    @Test
    public void firstElementMultipleOccurrences() {
        assertEquals(9, solution.solution(new int[]{100, 300, 500, 9, 9, 500, 300, 100, 800, 70, 1000, 70, 1000, 9, 800}));
    }

    @Test
    public void lastElement() {
        assertEquals(9000000, solution.solution(new int[]{100, 300, 500, 500, 300, 100, 800, 70, 1000, 70, 1000, 9000000, 800}));
    }

    @Test
    public void lastElementMultipleOccurrences() {
        assertEquals(9000000, solution.solution(new int[]{100, 300, 500, 500, 9000000, 9000000, 300, 100, 800, 70, 1000, 70, 1000, 9000000, 800}));
    }


}

