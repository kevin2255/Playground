import java.util.Scanner;
class Main
{
  public static int sq(int a){
      int sum = 0;
      for ( int i =0; i<= a; i++){
         sum = sum + i;
            }
    return sum;
   }
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int res = sq(num);
       int result = res;
       System.out.println(result);
	} 
}