//Cyclic sort is applicable only when the range of the numbers is from 1 to N (continuous)
// For Example: {5, 4, 6, 3, 2, 1} valid as the range of elements is from 1 to N
// For Example: {6, 4, 3, 2, 1, 7} INVALID as 5 is missing
package SortingAlgorithms;

import java.util.Scanner;

public class CycleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input from the user
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //Cycle Sort Logic
        int index = 0;
        while(index < n){
            int correct = arr[index] - 1;
            if(arr[index] != arr[correct]) swap(arr, index, correct);
            else index++;
        }
        
        //Printing the sorted array
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
