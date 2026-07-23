class Solution {
    public int rob(int[] nums) {
        int max=0;
        int prev1=0;
        int prev2=0;
        //int cost=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i]+prev2,prev1);
            //if(max<prev1)
            //{
            //cost=cost+max;
                prev2=prev1;
                prev1=max;
            //}
            //else
            //{
                //cost=cost+max;
                //prev2=nums[i];
                //prev1=nums[i+1];
            //}
        }
        return prev1;
    }
}
