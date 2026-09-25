class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        int leftpro=1;
        int rightpro=1;
        res[0]=1;
        res[nums.length-1]=1;
        for(int i=1;i<nums.length;i++)
        {
            leftpro=leftpro*nums[i-1];
            res[i]=leftpro;
        }
        for(int j=nums.length-2;j>=0;j--)
        {
            rightpro=rightpro*nums[j+1];
            res[j]=res[j]*rightpro;
        }
        return res;
    }
}  
