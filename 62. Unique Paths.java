https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
        int N=n+m-2;
        int r=m-1;
        double ans=1;
        for(int i=1;i<=r;i++){
            ans=ans*(N-r+i)/i;

        }
        return (int)ans;
    }
}
