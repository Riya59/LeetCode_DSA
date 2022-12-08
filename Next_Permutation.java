class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i,j;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i<0){
            reverse(nums,0,n-1);
        }
        else{
            for(j=n-1;j>i;j--){
                if(nums[j]>nums[i]){
                    break;
                }
            }
             swap(nums,i,j);
        reverse(nums,i+1,n-1);
        }
       
        
    }
    static void reverse(int arr[],int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
