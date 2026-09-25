class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int maxpro=nums[0];
        int minpro=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int oldmax=maxpro;
            int oldmin=minpro;
            maxpro=Math.max(nums[i],Math.max(nums[i]*oldmax,nums[i]*oldmin));
            minpro=Math.min(nums[i],Math.min(nums[i]*oldmax,nums[i]*oldmin));
            res=Math.max(res,maxpro);

        }
        return res;
    }
}
