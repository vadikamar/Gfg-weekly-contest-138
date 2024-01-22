class Solution {
    public static int minimizeArrayScore(int n, int[] arr) {
        Arrays.sort(arr);
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++)
        {
            int s=arr[i]+arr[n-i-1];
            m=Math.max(m,s);
        }
        return m;
    }
}
