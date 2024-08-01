class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        StringBuilder ans=new StringBuilder();

        int n=str.length;
        for(int i=n-1;i>=0;i--){
           ans.append(str[i]);
           if(i!=0){
            ans.append(" ");
           }

        }
        return ans.toString();
    }
}
