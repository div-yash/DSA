class Solution {
    public int findDuplicate(int[] nums) {
        

        //Brute Force :

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;

        // using sorting:
      
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
           
        // }
        // return -1;

        //using boolean array :
      
        int s=nums.length;
        boolean[] dup=new boolean [s];
        for(int i=0;i<s;i++){
            if(dup[nums[i]])
            {
                return nums[i];
            }
            dup[nums[i]]=true;
        }
        return -1;
    }
}
