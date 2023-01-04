package lessons.timeComplexity.frogJmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void whenXAndYIgual() {

        var result = new Solution().solution(1, 1, 3 );

        assertEquals(result,0);
    }


    @Test
    void whenNeedOneJump() {

        var result = new Solution().solution(10,40, 30 );

        assertEquals(result,1);
    }

    @Test
    void whenNeedTwoJumps() {

        var result = new Solution().solution(10,70, 30 );

        assertEquals(result,2);
    }

    @Test
    void whenNeedThreeJumps() {

        var result = new Solution().solution(10,85, 30 );

        assertEquals(result,3);
    }

    @Test
    void whenNeedFourJumps() {

        var result = new Solution().solution(10,130, 30 );

        assertEquals(result,4);
    }

    @Test
    void whenXIsGreaterThanY() {

        var result = new Solution().solution(10,9, 30 );

        assertEquals(result,0);
    }
}