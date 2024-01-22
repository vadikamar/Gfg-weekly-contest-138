class Solution{
    public long kMaxSubarray(int n, int k, int arr[]) {
        long m=arr[0];
        for(int i=0;i<n;i++)
        {
            long s=arr[i];
            m=Math.max(m,s);
            for(int j=i+1;j<i+k;j++)
            {
                if(j>=n) break;
                s+=arr[j];
                m=Math.max(m,s);
            }
        }
        return m;
    }
}
