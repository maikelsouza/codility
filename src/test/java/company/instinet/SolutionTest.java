package company.instinet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void whenNeed7steps() {
        String S = "011100";

        int result = new Solution().solution(S);

        assertEquals(result,7);
    }

    @Test
    void whenNeed5steps() {
        String S = "111";

        int result = new Solution().solution(S);

        assertEquals(result,5);
    }

    @Test
    void whenNeed22steps() {
        String S = "1111010101111";

        int result = new Solution().solution(S);

        assertEquals(result,22);
    }

    @Test
    void whenExistBigNumbers() {
        StringBuffer SB = new StringBuffer();

        for(int i = 0; i < 400000; i++){
            SB.append("1");
        }

        int result = new Solution().solution(SB.toString());

        assertEquals(result,799999);
    }

}