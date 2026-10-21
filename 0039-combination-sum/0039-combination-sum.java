
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    public void find(int index, int[] candidates, int target,
                     List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        list.add(candidates[index]);
        find(index, candidates, target - candidates[index], list, ans);

        list.remove(list.size() - 1);
        find(index + 1, candidates, target, list, ans);
    }
}
