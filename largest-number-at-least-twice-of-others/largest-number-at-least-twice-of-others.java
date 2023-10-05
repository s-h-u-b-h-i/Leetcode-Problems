class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                ans=i;
            }
        }
        // System.out.print(ans+" "+max);
        for(int i:nums){
            if(i!=max && 2*i > max) return -1;
        }
        return ans;
    }
}