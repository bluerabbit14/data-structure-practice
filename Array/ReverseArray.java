// Q1: Reverse an array/string
// Q2: Reverse an string(sentence) in word-wise 

import java.util.Stack;
class ReverseArray 
{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String str = "Hello, World!";
        String sentence="   My Name is Thomas Shelby ";
        reverse(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("\n" + reverse(str));
        System.out.print("\n" + reverseSentence(sentence));
        System.out.print("\n" + reverseSentence2(sentence));
    }

    static void reverse(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    static String reverse(String str){
        char[] charArray = str.toCharArray();
        int left=0,right=charArray.length-1;
        while(left<right)
        {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
    static String reverseSentence(String str){
        String[] words = str.trim().split(" ");
        int start=0; int end=words.length-1;
        while(start<end)
        {
         String temp=words[start];
         words[start]=words[end];
         words[end]=temp;
         start++;
         end--;
        }
        return String.join(" ", words);
    }
    static String reverseSentence2(String str){
        String[] result=str.trim().split("\\s+");
        Stack<String> stack=new Stack<>();
        for(String i: result)
        {
            stack.push(i);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString().trim();
    }
}

