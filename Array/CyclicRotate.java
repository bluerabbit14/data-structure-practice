// Q7. Cyclically rotate an array

import java.util.Scanner;
class CyclicRotate
{
    public static void main(String args[])
    {
        int[] array=new int[]{1,2,3,5,-1,2,5,-9};
        
        Cyclically(array,3);
        
    }
    static void Cyclically(int[] arr,int k)
    {
        int rotation = k % arr.length;
        while(rotation>0)
        {
            int temp=arr[0];
            for(int i=1;i<arr.length;i++)
            {
                arr[i-1]=arr[i];
            }
            arr[arr.length-1]=temp;  
            rotation--;
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}