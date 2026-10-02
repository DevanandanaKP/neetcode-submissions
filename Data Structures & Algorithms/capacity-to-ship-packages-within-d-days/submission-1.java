class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int weight:weights)
        {
            max=Math.max(max,weight);
            sum+=weight;
        }
        int low=max;
        int high=sum;
        int mid=0;
        while(low<high)
        {
            mid=low+(high-low)/2;
            int dayscount=1;
            int currentweight=0;
            for(int weight: weights)
            {
                if(weight+currentweight>mid)
                {
                    dayscount++;
                    currentweight=weight;
                }
                else
                {
                    currentweight+=weight;
                }
            }
            if(dayscount>days)
            {
                low=mid+1;

            }
            else
            {
                high=mid;
            }

        }
        return low;
        
    }
}