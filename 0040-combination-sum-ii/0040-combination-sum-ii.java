import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solution(candidates, target, current, ans, 0);

        return ans;
    }

    private void solution(int[] candidates,
                          int target,
                          List<Integer> current,
                          List<List<Integer>> ans,
                          int index) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);

            solution(candidates,
                     target - candidates[i],
                     current,
                     ans,
                     i + 1);

            current.remove(current.size() - 1);
        }
    }
}