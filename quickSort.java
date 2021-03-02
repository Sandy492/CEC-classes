package sorting;

import java.util.Scanner;
class Sorting{
    int partition(int arr[] , int l , int h ){
        int pivot =arr[h];
        int i =(l-1);
        for(int j=l;j<h;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        int temp =arr[i+1];
        arr[i+1]= arr[h];
        arr[h]=temp;
        return i+1;
    }
     void quick(int arr[] , int l, int h){
        if(l<h){
            int Index = partition(arr , l ,h);
            quick(arr ,l , Index-1);
            quick(arr , Index+1 , h);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Sorting ob = new Sorting();
        int h =arr.length-1;
        ob.quick(arr , 0 ,h);
        System.out.println("Sorted array is as follows : ");
        display(arr);
        System.out.println();
        }  
    static void display(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
        System.out.print(" " +arr[i]);
        }
    }
}