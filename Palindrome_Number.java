class Solution {
    
    public boolean isPalindrome(int x) {
       int temp = x;
       int rev = 0;
       if(x<0){
           return false;
       }
       while(x>0){
           int digit = x%10;
           rev = (rev*10)+digit;
           x = x/10;
       }
       if(rev == temp){
           return true;
       }
       else{
           return false;
       }
        
    }
}
