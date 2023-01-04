package lessons.timeComplexity.frogJmp;

public class Solution {

    public int solution(int X, int Y, int D){

        if (X > Y){
            return 0;
        }

        int resultSub = Y - X;

        return (int) Math.ceil((double) resultSub / (double) D);
    }
}
