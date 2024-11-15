class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
     int left =0;
     int right = arr.length - 1; 
     int n=arr.length;
     while(left +1 < n && arr[left] <= arr[left + 1]) left++;
     while(right - 1 >=0 && arr[right - 1] <= arr[right]) right--;

     if(left >= right) return 0;
     int ans = right, l=0, r=right;
     while(l <= left){
        while(r < n && arr[r] < arr[l] ) r++;
        ans = Math.min(ans, r- l-1);
        l++;
     } 
     return ans;  
    }
}