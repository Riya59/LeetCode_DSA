class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
  
        for(int i=1;i<n;i++){
            int b = nums[i-1] + nums[i];
            nums[i] = b;
        }
        return nums;
    }
}
