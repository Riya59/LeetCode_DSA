class Solution {
    public int singleNumber(int[] nums) {
        int count[] = new int[10000008];
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                count[10000008 + nums[i]]++;
            }
            else{
            count[nums[i]]++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                if(count[10000008+nums[i]]==1){
                    return nums[i];
                }
            }
            else{
            if(count[nums[i]]==1){
                return nums[i];
            }
            }
        }
        return -1;
    }
}
