import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f_d , l_d, sum ;
         f_d = n ;
        while (f_d >= 10){
           f_d = f_d / 10;
        }
        l_d = n % 10 ;
        sum = f_d + l_d ;
      System.out.println(sum);
	}
}