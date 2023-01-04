package lessons.countingElements.permCheck;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A){

        if(A.length == 0) {
            return 1;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++){
            if (A[i] != i+1){
                return 0;
            }
        }
        return 1;
    }
}
