class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                flag=1;
                break;
            }
            else
            {
             set.add(nums[i]);   
            }
        }
        if(flag==1)
        return true;
        else
        return false;
                
    }
}