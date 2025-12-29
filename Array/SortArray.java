// Q5.sort array of 0,1,2(without any algo).Sorting an array containing only 0, 1, and 2 is called the Dutch National Flag Algorithm.

import java.util.Arrays;
class SortArray
{
    public static void main(String[] args)
    {
        int[] array = {0, 1, 2, 0, 1, 2, 1, 0};
        //Arrays.sort(array);
        SortArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    static void SortArray(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                // arr[mid] == 2
                // swap arr[mid] and arr[high]
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}