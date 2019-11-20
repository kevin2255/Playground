import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
          int sum = 0, dig;
        while (num > 0){
           dig = num % 10;
           sum = sum + dig;
           num = num / 10;
        }
      System.out.println(sum);
	}
}