import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     int rev = 0, dig = 0;
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     while(num!=0){
    dig = num % 10;
     rev = rev * 10 + dig;
     num = num / 10;
     }
     System.out.println(rev);
  }
}