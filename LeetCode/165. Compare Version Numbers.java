https://leetcode.com/problems/compare-version-numbers/

class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        int v1len=version1.length();
        int v2len=version2.length();
        int n1,n2;
        while(i<v1len || j<v2len){
            n1=0;
            n2=0;
            while(i<v1len && version1.charAt(i)!='.'){
                n1=n1*10 +(version1.charAt(i)-'0');
                i++;
            }
            while(j<v2len && version2.charAt(j) !='.'){
                n2=n2*10+(version2.charAt(j)-'0');
                j++;
            }
            if(n1<n2){
                return -1;
            }
            else if(n1>n2){
                return 1;
            }
            i++;
            j++;
        }
        return 0;

    }
}
