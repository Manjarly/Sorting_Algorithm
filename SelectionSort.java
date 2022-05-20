//Time Complexity: O(n^2)
package SortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input from user
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //Selection Sort Logic
        for(int i = 0; i<n; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                minIndex = arr[j] > arr[minIndex] ? minIndex : j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        //Printing the sorted array
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
}