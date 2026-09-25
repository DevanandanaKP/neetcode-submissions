class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int max=nums[0];
        int min=nums[0];
        int curmax=nums[0];
        // int newmin=nums[0];
        // int newmax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            // newmax=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            // newmin=Math.min(nums[i],Math.min(nums[i]*max,nums[i]*min));
            // curmax=Math.max(newmax,curmax);
            // max=Math.max(max,newmax);
            // min=Math.min(min,newmin);
            int oldmax=max;
            int oldmin=min;
            max=Math.max(nums[i],Math.max(nums[i]*oldmax,nums[i]*oldmin));
            min=Math.min(nums[i],Math.min(nums[i]*oldmax,nums[i]*oldmin));
            curmax=Math.max(max,curmax);

        }



        // int curpro=nums[0];
        // int maxpro=nums[0];
        // int minpro=nums[0];
        // int newmin=nums[0];
        // int newmax=nums[0];
        // for(int i=1;i<nums.length;i++)
        // {
        //     // minpro=Math.min(curpro,minpro);
        //     // if(nums[i]<0)
        //     // {
        //     //     minpro=Math.min(nums[i]*curpro,nums[i]*minpro);
        //     //     curpro=Math.max(curpro,minpro);
        //     // }
        //     newmin=Math.min(nums[i],Math.min(nums[i]*newmax,nums[i]*newmin));
        //     newmax=Math.max(nums[i],Math.max(nums[i]*newmax,nums[i]*newmin));

        //     // curpro=Math.max(nums[i],curpro*nums[i]);
            
        //     maxpro=Math.max(newmax,newmin);
        // }
        // return maxpro;
        return curmax;
    }
}
