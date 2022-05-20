//Insertion Sort
//Time Complexity: O(n^2)

package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input from user
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        //Insertion Sort Logic
        for(int i = 1; i<a.length; i++){
            int temp = a[i];
            int j = i;
            while(j > 0 && a[j-1] > temp){
                a[j] = a[j-1];
                j -= 1;
            }
            a[j] = temp;
        }
        
        //Printing the sorted array
        for(int i : a){
            System.out.print(i+" ");
        }
    }
}
