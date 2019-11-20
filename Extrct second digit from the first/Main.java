import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f_d;
         f_d = n ;
        while (f_d >= 100){
           f_d = f_d / 10;
        }
         int ff_d = f_d % 10 ;
      System.out.println(ff_d);
	}
}