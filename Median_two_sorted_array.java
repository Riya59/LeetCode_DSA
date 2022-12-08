class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = nums1.length;
        int j = nums2.length;
        
        int arr[] = new int[i+j];
        System.arraycopy(nums1,0,arr,0,i);
        System.arraycopy(nums2,0,arr,i,j);
        Arrays.sort(arr);       
        
        double median = 0.0;
        int n = arr.length;
        if(n%2!=0){
               median=arr[n/2];
           }
          
           else{
                   median=(arr[n/2]+arr[(n/2)-1])/2.0;
                     
           }
        
     return median;
        
    }
    
    
}
