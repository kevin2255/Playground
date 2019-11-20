import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch(option){
          case 1: if(option== 1)
        				System.out.println("one");
                  break;
            case 2: if(option== 2)
        				System.out.println("two");
                  break;
             case 3: if(option== 3)
        				System.out.println("Three");
                  break;
             case 4: if(option== 4)
        				System.out.println("four");
                  break;
             case 5: if(option== 5)
        				System.out.println("five");
                  break;
          default:
                   System.out.println("Invalid");
            	break;
        }
                
	}
}