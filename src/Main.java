import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		
		
		System.out.println("Banking services!");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ID:");
		String id=input.nextLine();
		System.out.println("Enter your password:");
		String pass=input.nextLine();
		
		if ((id.equals("010"))&& (pass.equals("123"))){
			System.out.println("Login success!");
			Display mydisplay = new Display();
			mydisplay.menu();
			
			}
	else 
		System.out.println("Login fail!");
	}
}
