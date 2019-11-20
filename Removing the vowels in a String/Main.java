import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
      String st = sc.nextLine();
	 st = st.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(st);
  }
}
//

