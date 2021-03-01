package sorting;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the no of elements:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        swap(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    sc.close();
    }
static void swap(int arr[]){
    int temp;
    int n =arr.length;
    for(int i =0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                temp= arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
    }
}
}    
