class Solution {
    public void moveZeroes(int[] nums) {
        int write=0;
        int scan=0;
        while(scan<nums.length)
        {
            if(nums[scan]!=0)
            {
                nums[write]=nums[scan];
                write++;
            
                
            }
            
            scan++;
        }
        while(write<nums.length)
        {
            nums[write]=0;
            write++;
        }
        
    }
}