import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
         int rem = num1%100;
        int sec = rem /10;
       System.out.println(sec);
    }
}