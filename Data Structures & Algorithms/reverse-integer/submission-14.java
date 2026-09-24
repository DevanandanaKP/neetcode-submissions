class Solution {
    public int reverse(int x) {
        int count=0;
        int rev=0;
        int temp=x;
        int digit=0;
        while(temp!=0)
        {
            temp=temp/10;
            count++;
        }
        // if(x>999999999)
        // return 0;
        int tempx=x;

        while(x!=0)
        {
            digit=x%10;
            if (rev > Integer.MAX_VALUE / 10 ||
    (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
    return 0;
}

if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            rev=rev*10+digit;
            x=x/10;
           
        }
        // if(tempx<0)
        // {
        //     rev=-(rev);
        // }
        
        return rev;
    }
}
