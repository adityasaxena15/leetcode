class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solution("", ans, 0, 0, n);

        return ans;
    }

    private void solution(String current,
                          List<String> ans,
                          int open,
                          int close,
                          int n) {

        if(current.length() == 2 * n) {
            ans.add(current);
            return;
        }

        if(open < n) {
            solution(current + "(",
                     ans,
                     open + 1,
                     close,
                     n);
        }

        if(close < open) {
            solution(current + ")",
                     ans,
                     open,
                     close + 1,
                     n);
        }
    }
}