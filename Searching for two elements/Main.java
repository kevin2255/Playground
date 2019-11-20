import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = in.nextInt();
      }
     int s_e1 = in.nextInt();
      int s_e2 = in.nextInt();
     int turn1= 0;
     int turn2 = 0;
     int k=0,j=0;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
          if (s_e1 == arr[idx]){
           turn1 = idx;
           }
        
        
        if (s_e2 == arr[idx]){
           turn2 = idx;
           }
     
      }
       if (turn1>=0){
          System.out.println(turn1);
       }
       if (turn2>0){
          System.out.println(turn2);
       }
     else{
      System.out.println("-1");}
     
     
     
  
     
}
}