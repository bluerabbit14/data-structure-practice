// Q6.Move all negative elements to one side of the array

class MoveElement
{
    public static void main(String args[])
    {
        int[] array=new int[]{-1,-2,4,0,-2,-5};
        movenegative(array);
        for(int i:array)
        {
            System.out.print(i+" ");
        }
    } 
    static void movenegative(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]<0)
            start++;
            else if(arr[end]>0)
            end--;
            else
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }   
        }
    }
}