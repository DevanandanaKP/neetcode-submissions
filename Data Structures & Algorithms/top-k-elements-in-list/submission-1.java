class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hash.containsKey(nums[i]))
            {
                int count=hash.get(nums[i]);
                hash.put(nums[i],count+1);
            }
            else
            {
                hash.put(nums[i],1);
            }
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hash.entrySet());
        Collections.sort(list,(entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));

        int[] resarr=new int[k];
        for(int j=0;j<k;j++)
        {
            int ele=list.get(j).getKey();
            resarr[j]=ele;
        }
        return resarr;
    }
}
