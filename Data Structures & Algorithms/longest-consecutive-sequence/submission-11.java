class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        //2,3,4,4,5,10,20
        //-1,0,1,3,4
        int count=1;
        int max=0;
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1==nums[i])
            {
                //2+1=3, c=1
                //3+
                count++;
            }
            else if(nums[i]==nums[i-1])
            {
                
            }
            else
            {
                count=1;

            }
            max=Math.max(max,count);
        }
        return max;
    }
}
