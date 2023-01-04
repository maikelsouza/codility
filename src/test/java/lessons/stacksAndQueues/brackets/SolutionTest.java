package lessons.stacksAndQueues.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    void whenExistAllPairs() {
        String S = "{[()()]}";

        int result = new Solution().solution(S);

        assertEquals(result,1);
    }

    @Test
    void WhenThePairsAreNotInOrder() {
        String S = "([)()]";

        int result = new Solution().solution(S);

        assertEquals(result,0);
    }

    @Test
    void whenExistOnlyTypeInOrder() {
        String S = "(((())))";

        int result = new Solution().solution(S);

        assertEquals(result,1);
    }

    @Test
    void whenNotExistNumberElementsPair() {
        String S = "{[(";

        int result = new Solution().solution(S);

        assertEquals(result,0);
    }

    @Test
    void whenNotExistElements() {
        String S = "";

        int result = new Solution().solution(S);

        assertEquals(result,1);
    }

}