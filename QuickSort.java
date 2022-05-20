
package SortingAlgorithms;

import java.util.Scanner;


public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input from user
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //Quick Sort Logic
        qs(arr, 0, n-1);
        
        //Printing the sorted array
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void qs(int[] a, int lowIndex, int highIndex){
        
        if(lowIndex < highIndex){
            
            int pivotIndex = partition(a, lowIndex, highIndex);
            qs(a, lowIndex, pivotIndex-1);
            qs(a, pivotIndex+1, highIndex);
            
        }
    }
    
    public static int partition(int[] a, int lowIndex, int highIndex){
        int pivotElement = a[highIndex];    //Taking last element as the pivot element
        int space = lowIndex - 1;
        
        for(int j = lowIndex; j<highIndex; j++){
            if(a[j] < pivotElement){
                space++;
                //swap
                int temp = a[space];
                a[space] = a[j];
                a[j] = temp;
            }
        }
        space++;
        int temp = a[space];
        a[space] = pivotElement;
        a[highIndex] = temp;
        return space;   //Pivot Index
    }
}