import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String [] name = new String[5];
	    int [] age = new int[5];
	    Scanner sc = new Scanner(System.in);
	   
	    for(int i = 0; i < name.length;i++){
	        System.out.println("What's your name?");
	        name[i]= sc.nextLine();
	        System.out.println("What's your age?"); 
	        age[i]= sc.nextInt();
          sc.nextLine();
	    }
	    System.out.println("The list of adults is as follows: ");
	     for(int i = 0; i < name.length;i++){
	       if(age[i] >= 18){ 
	           System.out.println(name[i]);
	       }
	    }
	}
}