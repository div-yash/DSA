https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0;
        int j=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                if(ans.size()==0|| ans.get(ans.size()-1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }
            else{
                if(ans.size()==0||ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n){
            if(ans.get(ans.size()-1)!=arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(ans.get(ans.size()-1)!=arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }
        return ans;
}

}
