https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        String ans="";
        int index=0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                 ans=ans+str1.charAt(index);
                index++;
               
            }
            else{
                break;
            }
        }
        return ans;
    }
}
