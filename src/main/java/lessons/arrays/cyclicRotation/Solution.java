package lessons.arrays.cyclicRotation;

public class Solution {

    public int[] solution(int[] A, int K){

        if (A.length == 0){
            return new int[0];
        }

        for (int i = 0; i < K; i++){
            A = this.rotate(A);
        }

        return A;
    }

    private int[] rotate(int[] A){

        int[] result = new int[A.length];
        result[0] = A[A.length-1];

        for(int i = 0; i < A.length-1; i++){
            result[i+1] = A[i];
        }
        return result;
    }
}
