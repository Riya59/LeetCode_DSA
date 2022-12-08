class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int j,k,sum;
        for(int i=0;i<n-2;i++){
            j = i+1;
            k = n-1;
            while(j<k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer>ls = new ArrayList<Integer>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    res.add(ls);
                    j++;
                    k--;
                    while(j<k && (nums[j] == nums[j-1])){
                        j++;
                    }
                    while(j<k && (nums[k] == nums[k+1])){
                        k--;
                    }
                }
                else if(sum>0){
                    k--;
                    while(j<k && (nums[k] == nums[k+1])){
                        k--;
                    }
                }
                else{
                    j++;
                    while(j<k && (nums[j] == nums[j-1])){
                        j++;
                    }
                }
                while(i<n-2 && (nums[i] == nums[i+1])){
                    i++;
                }
            }
        }
        return res;
        
    }
}
