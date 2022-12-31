class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int index=0;
        int max = nums[0];
        for(int i=1;i<n;i++){
            if(max<nums[i]){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}
