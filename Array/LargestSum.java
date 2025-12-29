//Q8. find the largest sum (subarray) (kardane's algo)

class LargestSum
{
    public static void main(String args[])
    {
        int[] arr=new int[]{12,4,5,1,0,-1,-9,9,3};
        System.out.println("Highest sum of window :"+largestSum(arr,3));
        System.out.println("Maximum sum subarray: "+maxSum(arr));
        System.out.println("Minimum sum subarray: "+minSum(arr));
        
    }
    static int maxSum(int[] arr)
    {
        int maxsum=arr[0];
        int currentsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currentsum=Math.max(maxsum,currentsum+arr[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
    static int minSum(int[] arr)
    {
        int minimum=arr[0];
        int currentsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currentsum=Math.min(arr[i],currentsum+arr[i]);
            minimum=Math.min(minimum,currentsum);
        }
        return minimum;
    }
    static int largestSum(int[] arr, int windowSize) 
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - windowSize; i++) 
        {
          int sum = 0;
          int count = windowSize;
          int j = i;

        while (count > 0) 
        {
            sum += arr[j];
            j++;
            count--;
        }
          max = Math.max(max, sum);
        }
    return max;
  }
}