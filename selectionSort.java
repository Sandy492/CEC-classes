package sorting;

import java.util.Scanner;
public class selectionSort{
    
    static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp =arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selection(arr);
        display(arr);
    }
    static void display(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}