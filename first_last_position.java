class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int first = -1, last = -1;
        for(int i=0;i<n;i++){
            if(first == -1 && nums[i] == target){
                first = i;
            }
           if(nums[i] == target){
                last = i;
            }
        }
        int index[] = {first,last};
        return index;
    }
}
