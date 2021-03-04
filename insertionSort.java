package sorting;
import java.util.Scanner;
class insertion{
    void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        insertion ob = new insertion();
        ob.sort(arr);
        display(arr);
        System.out.println();
    }
    static void display(int arr[]){
        for(int i :arr){
            System.out.print(i +" ");
        }
    }
}
