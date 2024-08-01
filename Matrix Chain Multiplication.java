//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends

 
//User function Template for Java

class Solution{
    static int matrixMultiplication(int n, int arr[])
    {
        // code here
        
        int dp[][]=new int[n][n];
        
        for (int i=1;i<n;i++){
            dp[i][i]=0;
        }
        int j;
        for(int l=2;l<n;l++){
            for(int i=1;i<n-l+1;i++){
                j=i+l-1;
                if(j==n){
                    continue;
                }
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int q=dp[i][k]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j];
                    if(q<dp[i][j]){
                        dp[i][j]=q;
                    }
                }
            }
            
        }
        return dp[1][n-1];
    }
}
