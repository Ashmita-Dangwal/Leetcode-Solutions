class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> currentPath, List<List<Integer>> result) {
        result.add(new ArrayList<>(currentPath));
        for (int i = index; i < nums.length; i++) {
            currentPath.add(nums[i]);
            backtrack(nums, i + 1, currentPath, result);
            currentPath.remove(currentPath.size() - 1);
        }  
    }
}