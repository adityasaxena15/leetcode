import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currArr = new ArrayList<>();

        solve(candidates, 0, target, currArr, ans);

        return ans;
    }

    public void solve(int[] candidates,
                      int index,
                      int target,
                      List<Integer> currArr,
                      List<List<Integer>> ans) {

        // Found a valid combination
        if (target == 0) {
            ans.add(new ArrayList<>(currArr));
            return;
        }

        // No more elements left
        if (index == candidates.length) {
            return;
        }

        // TAKE
        if (candidates[index] <= target) {

            currArr.add(candidates[index]);

            solve(candidates,
                  index,
                  target - candidates[index],
                  currArr,
                  ans);

            // Backtrack
            currArr.remove(currArr.size() - 1);
        }

        // NOT TAKE
        solve(candidates,
              index + 1,
              target,
              currArr,
              ans);
    }
}