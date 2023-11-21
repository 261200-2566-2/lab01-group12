import  java.util.Scanner;
public class Main {
    public static void bubbleSort(int size,int[] arr){
        for (int i=0;i<size;i++){
            for (int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("array["+(i+1)+"] : ");
            arr[i] = s.nextInt();
        }
        System.out.print("Input : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n**Bubble Sort**");
        bubbleSort(n,arr);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}