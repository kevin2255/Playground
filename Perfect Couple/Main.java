import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int a[] = new int[size];
      for(int i = 0; i < size; i++){
         a[i] = sc.nextInt();
      }
      int s = sc.nextInt();
      for(int i = 0; i < size; i++){
         for(int j = i+1; j < size; j++){
        if(a[i]+a[j] == s){
           System.out.println(a[i]+", "+a[j]);
          //System.out.print
        }
         }
      }
    }
}
//

