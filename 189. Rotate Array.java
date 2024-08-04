class Solution {
    public void rotate(int[] nums, int k) {
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int temp=(i+k)%nums.length;
        //     arr[i]=nums[temp];
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=arr[i];
        // }

        k = k % nums.length;
        reverseArr(nums,0,nums.length-1);
        reverseArr(nums,0,k-1);
        reverseArr(nums,k,nums.length-1);


    }
    public int[] reverseArr(int [] nums,int l,int r)
    {
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l=l+1;
            r=r-1;
        }
        return nums;
    }
    
    

}
