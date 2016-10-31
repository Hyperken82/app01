
import java.util.*;public class Display
{
	String choice;
public static	int money=1000;

Scanner input=new Scanner(System.in);

public int withdraw(){
System.out.println("Total amount is " +money);
System.out.println("Amount withdraw?");
System.out.println("A.300");
System.out.println("B.500");
choice=input.nextLine();

	switch(choice)
	{
		case"A":System.out.println("Withdraw 300");
				 money=money-300;
		break;
		
		case"B": System.out.println("Withdraw 500");
				 money=money-500;
		break;
		
		default: System.out.println("Wrong input");
		
		
	}
	
	System.out.println("The balance is "+money);
	return money;
	}
	
	public int deposit(){
		System.out.println("Total amount is "+money);
		System.out.println("Amount to deposit?");
		System.out.println("A.300");
		System.out.println("B.500");
		choice=input.nextLine();

		switch(choice)
		{
			case"A":System.out.println("Withdraw 300");
				money=money+300;
				break;

			case"B": System.out.println("Withdraw 500");
				money=money+500;
				break;

			default: System.out.println("Wrong input");
			
		}

		System.out.println("The balance is "+money);
		return money;
	}
	public void menu(){
		do{
		System.out.println("Total amount is "+money);
		System.out.println("Menu");
		System.out.println("A.Withdraw");
		System.out.println("B.Deposit");
		System.out.println("0.Exit");
		choice=input.nextLine();
		switch(choice){
			case "A": System.out.println("Withdraw");
					withdraw();
			break;
			
			case "B": System.out.println("Deposit");
					deposit();
			break;
			case "0": System.out.println("Exit");
			
			break;
			
			default: System.out.println("Wrong input");
			
		}
	}
	while(!"0".equals(choice));
	System.out.println("Balance is "+money);
	}
}
