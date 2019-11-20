import java.util.Scanner;
class Main
{
  public static int sq(int a){
     int square = a * a;
     return square;
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