class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int[] result=new int[2];
        int need=0;
        for(int i=0;i<nums.length;i++)
        {
            need=target-nums[i];
            
               if(hash.containsKey(need) && i!=hash.get(need))
                {
                    result[1]=i;
                    result[0]=hash.get(need);
                    return result;
                }
            
            else
            {
                hash.put(nums[i],i);
                if(hash.containsKey(need) && i!=hash.get(need))
                {
                    result[0]=hash.get(nums[i]);
                    result[1]=hash.get(need);
                    return result;
                }
                
            }
        }
        return result;

    }
}
