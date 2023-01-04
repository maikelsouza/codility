package lessons.arrays.oddOccurrencesInArray;

import java.util.Arrays;

public class Solution {


    public int solution(int[] A) {

        if (A.length == 1) {
            return A[0];
        }

        Arrays.sort(A);

        int lastIndex = A.length - 1;
        if (A[lastIndex] != A[lastIndex-1]){
            return A[lastIndex];
        }

        boolean change = false;
        int count = 1;
        for (int i = 0; i < A.length -1; i++) {
            if (A[i] == A[i+1]) {
                count++;
            }else{
                change = true;
            }
            if ((change || i == lastIndex -1) && count % 2 != 0) {
                return A[i];
            }if (change){
                count = 1;
                change = false;
            }
        }
        return 0;
    }

}
