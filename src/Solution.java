import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> s1 = new ArrayDeque<>();
        int index = 0;
        if (pushed.length == 0){
            return true;
        }
        for (int i: pushed) {
            s1.push(i);
            while (!s1.isEmpty() && s1.peek() == popped[index]){
                s1.pop();
                index++;
            }
        }
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        Solution  s= new Solution();
        int[] pu = {1,2,3,4,5};
        int[] pop = {4,3,5,1,2};
        boolean b = s.validateStackSequences(pu, pop);
        System.out.println("b = " + b);
    }
}