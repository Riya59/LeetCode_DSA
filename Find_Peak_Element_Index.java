class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int index=0;
        int maxi = nums[0];
        for(int i=1;i<n;i++){
            if(maxi<nums[i]){
                maxi = nums[i];
                index = i;
            }
        }
        return index;
    }
}
