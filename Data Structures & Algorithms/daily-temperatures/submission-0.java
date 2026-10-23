class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        int [] res = new int [n];

        for(int l = n -2; l >= 0; l--){
            int r = l + 1;
            while(r < n && temperatures[r] <= temperatures[l]){
                if(res[r] == 0){
                    r = n;
                    break;
                }

                
                    r += res[r];
                        
            }
            if(r < n){
                res[l] = r - l;  
            }

        }
        return res;
    }
}
