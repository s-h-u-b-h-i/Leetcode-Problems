class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int cz=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cz++;
            while(cz>1){
                if(nums[left]==0) cz--;
                left++;
            }
            result=Math.max(result,i-left);
        }
        if(result==nums.length) return result-1;
        return result;
    }
}