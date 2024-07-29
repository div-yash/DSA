class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int lastSmaller=Integer.MIN_VALUE;
        int count=0;
        int large=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmaller){
                count++;
                lastSmaller=nums[i];
            }
            else if (nums[i] != lastSmaller) {
                count = 1;
                lastSmaller = nums[i];
            }
            large = Math.max(large, count);
        }
        return large;
    }
}
