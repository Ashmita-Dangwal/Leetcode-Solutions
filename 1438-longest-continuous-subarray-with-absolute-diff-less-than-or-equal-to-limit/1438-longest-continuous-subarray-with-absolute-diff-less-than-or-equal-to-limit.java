class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < nums.length; right++){
            int num = nums[right];
            while(!maxDeque.isEmpty() && maxDeque.peekLast() < num){
                maxDeque.pollLast();
            }
            maxDeque.offerLast(num);

            while(!minDeque.isEmpty() && minDeque.peekLast() > num){
                minDeque.pollLast();
            }
            minDeque.offerLast(num);

            while(!maxDeque.isEmpty() && !minDeque.isEmpty() && maxDeque.peekFirst() - minDeque.peekFirst() > limit){
                if(maxDeque.peekFirst() == nums[left]) maxDeque.pollFirst();
                if(minDeque.peekFirst() == nums[left]) minDeque.pollFirst();
                left++;
            }
            maxLength = Math.max(maxLength , right - left + 1);
        }

        return maxLength;
    }
}