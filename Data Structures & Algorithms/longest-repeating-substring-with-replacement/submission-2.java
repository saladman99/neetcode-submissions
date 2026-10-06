class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> mp = new HashMap<>();

        int l =0, res =0, fmax =0;

        for(int r =0; r < s.length(); r++ ){
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            fmax = Math.max(fmax, mp.get(s.charAt(r)));

            while((r - l + 1) - fmax > k){
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }
        return res;



    }
}
