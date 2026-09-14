class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        boolean test = false; 
        for(int i = 0; i < nums.length; i++){
            if(map.containsValue(nums[i])){
                test = true;
                break;
            }
            map.put(i, nums[i]);
        }
        return test;
    }
}