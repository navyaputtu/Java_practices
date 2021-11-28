import java.util.Scanner;
public class BankTest {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		String accName,accType,address;
		Bank bank=null;
		long accNo;
		int choice,amt;
		System.out.println("Account Number : ");
		accNo = in.nextLong();
		System.out.println("Account Name : ");
		accName = in.nextLine();
		accName = in.nextLine();
		System.out.println("Account Type : ");
		accType = in.nextLine();
		System.out.println("Address : ");
		address = in.nextLine();
		System.out.println("Initial Amount : ");
		amt = in.nextInt();
		 bank=new Bank(accNo,accName,amt,accType,address);
		 do {
			 System.out.println("1. Deposit");
			 System.out.println("2. Withdraw");
			 System.out.println("3. Show Balance");
			 System.out.println("4. Exit");
			 System.out.println("select your operation :");
			 choice=in.nextInt();
			 
			 if(choice ==1) {
				 int cnt =0;
				 while(true) {
					 System.out.println("Amount to be Deposited  : ");
					 amt = in.nextInt();
					 if(bank.deposit(amt)) {
						 System.out.println("Transaction Successful");
						 System.out.println("Balance : " + bank.getBalance());
						 break;
					 }
					 else
						 System.out.println("Invalid amount.pleaseenter multiples of 100");
					 cnt++;
					 if(cnt==3) {
						 System.out.println("Attempted 3 times.Try After some time");
						 break;
						 
						 }
					 }
			 }
			 else if (choice==2) {
				 while(true) {
					 int result;
					 System.out.println("Amount to be withdraw : ");
					 amt=in.nextInt();
					 result=bank.withdraw(amt);
					 if(result==1) {
						 System.out.println("Transaction successful");
						 System.out.println("Balance : "+bank.getBalance());
						 break;
					 }
					 else if(result == -1)
						 System.out.println("Invalid amount.pleaseenter multiples of 100");
					 else
						 System.out.println("Insufficient fund!....Enter amount less than  "+bank.getBalance());
					 
					 }
				 }
			 else if(choice==3)
				 System.out.println("Balance :"+bank.getBalance());
		 }while(choice!=4);
		 System.out.println("Thank You! Visit Again!");
		
			 
		 

	}

}
