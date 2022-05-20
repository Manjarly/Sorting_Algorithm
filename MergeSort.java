//Time Complexity: O(n*logn)
package SortingAlgorithms;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input from user
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //Merge Sort Logic
        divide(arr, 0, n-1);
        
        //Printing the sorted array
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    //Dividing the whole array until singleton array
    public static void divide(int[] a, int startIndex, int endIndex){
        if(startIndex >= endIndex) return;
        
        int mid = startIndex + (endIndex - startIndex) / 2;
        // (startIndex + endInde)/2 ----> This might result in space complexity.
        // For example if both startIndex and endIndex are very larger then the sum will exceed the integer value
        // hence to avoid that we use the formule startIndex + (endIndex - startIndex) / 2
        
        divide(a, startIndex, mid);
        divide(a, mid+1, endIndex);
        conquer(a, startIndex, mid, endIndex);
    }
    
    //Sorting the array after dividing
    public static void conquer(int[] a, int startIndex, int mid, int endIndex){
        int[] merged = new int[endIndex - startIndex + 1];
        
        int index1 = startIndex;
        int index2 = mid+1;
        int index = 0;
        
        while(index1 <= mid && index2 <= endIndex){
            if(a[index1] <= a[index2]){
                merged[index++] = a[index1++];
            }
            else{
                merged[index++] = a[index2++];
            }
        }
        while(index1 <= mid){
            merged[index++] = a[index1++];
        }
        while(index2 <= endIndex){
            merged[index++] = a[index2++];
        }
        
        for(int i = 0, j = startIndex; i<merged.length; i++, j++){
            a[j] = merged[i];
        }
    }
}
