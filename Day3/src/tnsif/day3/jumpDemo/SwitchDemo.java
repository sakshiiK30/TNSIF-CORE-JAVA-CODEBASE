package tnsif.day3.jumpDemo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int userInput=4;
		
		switch(userInput)
		{
		case 1: System.out.println("current recharge details ");
		break;
		
		case 2: System.out.println("current recharge expires ");
		break;
		
		case 3: System.out.println(" new offers ");
		break;
		
		case 4: System.out.println(" talk to our customer support person");
		break;
		
		default :
			System.out.println(userInput + "is not a valid input given by you");
		}

	}

}
