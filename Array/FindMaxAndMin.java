// Q3. Find the Maximum and Minimum in an array
// Q4. find the kth Maximum and mnimum in an array

import java.util.PriorityQueue;

class FindMaxAndMin
{
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 8, -2, 7};
        findMaxMin(array);
        findMaxMin(array,3);
    }

    static void findMaxMin(int[] arr){
        if (arr == null || arr.length == 0) 
        {
            throw new IllegalArgumentException("Array is empty");
        }
        int max=arr[0];
        int min=arr[0];
        for (int num : arr) 
        {
            if (num > max) 
            {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.print("Maximum: "+max+"\n"+"Minimum: "+min+"\n");
    }
    static void findMaxMin(int[] arr, int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b) -> b-a);

        if (arr == null || arr.length == 0) 
        {
            throw new IllegalArgumentException("Array is empty");
        }
        if(k<1 || k>arr.length)
        {
           throw new IllegalArgumentException("Array does not have enough element");
        }
        for(int i:arr)
        {
             minHeap.offer(i);
             if(minHeap.size()>k)
             {
                minHeap.poll();
             }
             maxHeap.offer(i);
             if(maxHeap.size()>k)
             {
                maxHeap.poll();
             }
        }
        System.out.println("Kth Max = " + minHeap.peek());
        System.out.println("Kth Min = " + maxHeap.peek());
        
    }
}