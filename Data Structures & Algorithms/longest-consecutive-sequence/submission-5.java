class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int start=0;
        if(nums.length==0)
        return 0;
        if(nums.length==1)
        return 1;
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1))
            {
            start=nums[i];
            int count=1;
            while(set.contains(start+1))
            {
            count++;
            start++;
            }        
            max=Math.max(max,count);
            }    
        }
        
        return max;
    }
}
