class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp = new HashMap<>();

        int l =0, res =0, fmax =0;

        for(int r = 0; r < s.length(); r++){
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            fmax = Math.max(mp.get(s.charAt(r)), fmax);

            while( (r - l + 1) - fmax > k){
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max((r - l + 1), res);
        }
        return res;
    }
}
