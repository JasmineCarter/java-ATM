import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		Atm myAtm = new Atm(100); 
		
		System.out.println("Welcome to WCCI Bank, please enter your PIN");
		String enteredPin = input.nextLine(); 
		
		while (!enteredPin.equals(myAtm.getRequiredPin())) {
			System.out.println("Pin is incorrect, please try again.");
			enteredPin = input.nextLine(); 
	}
		String choice; 
	do {
		System.out.println("Welcome to Bank of WCCI");
		System.out.println("Choose an option");
		System.out.println("Press 1 for deposit");
		System.out.println("Press 2 for withdrawal");
		System.out.println("Press 3 for check balance");
		System.out.println("Press 4 to exit");
		choice = input.nextLine(); 
		
		if (choice.equals("1")) {
			System.out.println("How much would you like to deposit?");
			int amount = input.nextInt(); 
			myAtm.deposit(amount); 
			
		}else if (choice.equals("2")) {
			System.out.println("How much would you like to withdrawal");
			System.out.println("This ATM only withdrawals multiples of 10");
			int amount = input.nextInt();
			myAtm.withdrawl(amount);
			input.nextLine();
			
		}else if (choice.equals("3")) {
			System.out.println("Your current balance is " + myAtm.getBalance());
			
		}else 
			System.out.println("Thank you for banking with us today...goodbye!");
		
			
		
		
	} while (!choice.equals("4"));
}
	
}
