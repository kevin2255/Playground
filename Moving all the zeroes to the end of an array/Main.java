import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int index = 0; index < n; index++){
          arr[index] = sc.nextInt();
       }
       pushzero(arr, n);
       for (int i = 0; i < n; i++){
       System.out.print(arr[i]+" ");
       }
    }
  
  public static void pushzero(int arr[], int n){
      int count = 0;
      for (int i = 0; i < n; i++){
         if(arr[i] != 0)
            arr[count++] = arr[i];
      }
       while(count < n)
          arr[count++] = 0;
  }
}


//
