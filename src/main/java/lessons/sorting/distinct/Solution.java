package lessons.sorting.distinct;

import java.util.HashSet;
import java.util.Set;

public class Solution {


    public int solution(int[] A){
        Set<Integer> sett = new HashSet<>();
        for (int element : A) {
            sett.add(element);
        }

        return sett.size();
    }
}
