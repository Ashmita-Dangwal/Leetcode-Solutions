class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()){
            int curr = queue.poll();

            if(curr < 0 ||  curr >= n){
                continue; 
            }

            if(arr[curr] == 0){
                return true;
            }
            if(arr[curr] < 0) continue;

            int jump = arr[curr];
            arr[curr] = -arr[curr];

            if(curr+jump < n){
                queue.add(curr+jump);
            }
            if(curr-jump >= 0){
                queue.add(curr-jump);
            }

        }
        return false;
    }
}