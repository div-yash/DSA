https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

class Solution
{
	public static int[] selectionSort(int arr[], int n)
	{
	    //code here
	    for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
	        
	    }
	    return arr;
	    
	}
}
