package lessons.sorting.distinct;

import java.util.HashSet;
import java.util.Set;

public class Solution {


    public int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for (int element : A) {
            set.add(element);
        }
        return set.size();
    }
}
