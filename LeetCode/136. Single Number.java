https://leetcode.com/problems/single-number/

Q. Find the number that appears once, and other numbers twice.


/*class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        if(n==1){
            return nums[n-1];
        }
        else{
            for(int i=0;i<n;i++){
                int count =0;
                int check=nums[i];
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count==1){
                    ans= nums[i];
                }
            }
        }
        return ans;
    }
}*/

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
         return nums[0];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i-1]) 
            return nums[i-1];
        }
        return nums[nums.length - 1];
    }
}
