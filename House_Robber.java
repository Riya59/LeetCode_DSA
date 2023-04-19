class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int incl = nums[0];
        int excl_new;
       
        for(int i=1;i<n;i++){
            excl_new = Math.max(incl, sum);
            incl = sum + nums[i];
            sum = excl_new;
        }
        return Math.max(incl,sum);
    }
}
