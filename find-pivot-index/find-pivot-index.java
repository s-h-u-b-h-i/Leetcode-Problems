class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int l=0,r=0,c=0;
        for(int i=0;i<nums.length;i++){
            c=l+nums[i];
            r=sum-c;
            if(l==r) return i;
            l+=nums[i];
        }
        return -1;
    }
}