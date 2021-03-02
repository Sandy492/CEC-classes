 import java.util.*;

 class randomised {
    void randomisation(int arr[], int l , int h){
        Random rand = new Random();
        int pivot = rand.nextInt(h-l)+l;
        int temp; 
        temp= arr[pivot];
        arr[pivot]=arr[h];
        arr[h]= temp;
    }
    int partition(int arr[] , int l , int h){
        randomisation(arr, l, h);
        int pivot = arr[h];
        int i=(l-1);
        for(int j=l;j<h;j++){
            if(arr[j]<=pivot){
                i++;
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        int temp =arr[i+1];
        arr[i+1] =arr[h];
        arr[h]= temp;
        return i+1;
    }
    void quick(int arr[] , int l , int h){
        if(l<h){
            int pivotIndex = partition(arr , l ,h);
            quick(arr , l, pivotIndex-1);
            quick(arr , pivotIndex+1, h);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the no. of elements : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements ofthe array  : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int  h = arr.length-1;
        randomised ob = new randomised();
        ob.quick(arr, 0, h);
        System.out.println("Sorted Array is : ");
        display(arr);
        System.out.println();
        sc.close();
    }
    static void display(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
