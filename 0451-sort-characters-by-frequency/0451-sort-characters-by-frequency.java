class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0) + 1);
        }
        List<Character>[] bucket = new List[s.length()+1];
        for(char c : map.keySet()){
            int frequency = map.get(c);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(c);
        }
        StringBuilder result = new StringBuilder();
        for(int i = bucket.length-1; i>=0; i--){
            if(bucket[i] != null){
                for(char c: bucket[i]){
                    for(int count = 0;count <i; count++){
                        result.append(c);
                    }
                }
            }
        }
        return result.toString();
    }
}