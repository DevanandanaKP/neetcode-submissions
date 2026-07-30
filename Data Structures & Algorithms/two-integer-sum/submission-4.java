class Solution {
    public int[] twoSum(int[] nums, int target) {
        int need=0;
        int[] result=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            need=target-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(need==nums[j] && i!=j)
                {
                    result[0]=i;
                    result[1]=j;
                    
                    return result;
                    
                }
            }
        }

        
        
        return result;
    }
}
