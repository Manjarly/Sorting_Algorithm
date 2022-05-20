//Count Sort

// https://www.youtube.com/watch?v=OKd534EWcdk  Not made by me
//  Only for reference
package SortingAlgorithms;

import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   //Length of the array to be sorted
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){     //Array values input
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i : arr){       //Finding maximum in an array
            max = Math.max(max, i);
        }
        int[] dummy = new int[max+1];   //creating a dummy array to get the number of counts of each value
        
        for(int i = 0; i < n; i++){     //Getting the count of each element
            dummy[arr[i]]++;
        }
        
        for(int i = 1; i < dummy.length; i++){      //Manipulating the count (view the video)
            dummy[i] += dummy[i-1];
        }
        
        for(int i = dummy.length-1; i > 0; i--){    //Manipulating the count (view the video)
            dummy[i] = dummy[i-1];
        }
        dummy[0] = 0;
        
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++){
            result[dummy[arr[i]]] = arr[i];
            dummy[arr[i]]++;
        }
        
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
