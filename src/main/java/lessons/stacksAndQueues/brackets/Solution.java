package lessons.stacksAndQueues.brackets;

import java.util.Stack;

public class Solution {


    public int solution(String S) {
        char[] chars  = S.toCharArray();

        if (chars.length % 2 != 0) {
            return 0;
        }

        if (chars.length == 0) {
            return 1;
        }

        Stack<Character> brackets = new Stack<>();

        for (char aChar : chars) {
            if (!brackets.empty()) {
                Character bracket = brackets.peek();
                if (validateBracket(bracket, aChar)) {
                    brackets.pop();
                } else {
                    brackets.push(aChar);
                }
            } else {
                brackets.push(aChar);
            }
        }

        return brackets.empty() ? 1 : 0;
    }

    private boolean validateBracket(char elementStack, char elementArray) {
        return (elementStack == '{' && elementArray == '}') || (elementStack == '[' && elementArray == ']') ||
                (elementStack == '(' && elementArray == ')');
    }
}
