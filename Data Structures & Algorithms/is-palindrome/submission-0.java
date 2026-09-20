class Solution {
    public boolean isPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(!Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            else
            {
                char chl=s.charAt(left);
                char chr=s.charAt(right);
            if(Character.toLowerCase(chl)!=Character.toLowerCase(chr))
            {   
               return false; 
            }
            left++;
                right--;

            }
            
        } 
        return true;
    }
}
