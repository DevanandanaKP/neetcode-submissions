class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num=0;num<nums.length;num++)
        {
            if(set.contains(nums[num]))
            {
                return true;
            }
            else
            {
                set.add(nums[num]);
            }
        }
        return false;
        
    }
}