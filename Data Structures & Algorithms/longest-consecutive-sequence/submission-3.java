class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();
        int res = 0;

        for( int num : nums){
            store.add(num);
        }

        for(int num : nums){
            if(!store.contains(num - 1)){
            int streak = 0;
            int curr = num;
            while(store.contains(curr)){
                streak++;
                curr++;
            }
            res = Math.max(streak,res);
            }
            
        }
        return res;
    }
}
