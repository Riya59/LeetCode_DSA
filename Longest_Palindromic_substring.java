class Solution {
    public String longestPalindrome(String s) {
        int index = 0;
        int n = s.length();
        int palindromelength = 1;
        for(int i=1;i<n;i++){
            int left = i-1;
            int right = i;
            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                if(right-left+1 > palindromelength){
                    index = left;
                    palindromelength = right - left + 1;
                }
                left--;
                right++;
            }
            left = i-1;
            right = i+1;
            while(left>=0 && right<n && s.charAt(left) == s.charAt(right)){
                if(right-left+1 > palindromelength){
                    index = left;
                    palindromelength = right - left + 1;
                }
                left--;
                right++;
            }
        }
        String ans="";
    for(int i=index;i< index+palindromelength;i++){
        ans = ans + s.charAt(i);
    }
    return ans;
    }
   
  
}
