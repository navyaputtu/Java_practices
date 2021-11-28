
public class Bank {
	//properties
	private long accountNumber;
	private String accountName;
	private float balance;
	private String accountType;
	private String address;
	
	
	//constructor
	public Bank(long accNo,String accName,float initialAmount,String acType,String addr) {
		this.accountNumber=accNo;
		this.accountName=accName.toUpperCase();
		this.accountType=acType.toUpperCase();
		this.address=addr.toUpperCase();
		this.balance=initialAmount;
	}
	//getters
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public float getBalance() {
		return balance;
	}
	public String getaccountType() {
		return accountType;
	}
	public String getAddress() {
		return address;
	}
	//setters
	public void setAccountName(String accountName) {
	  this.accountName=accountName;
	}
	public void getAddress(String address) {
		this.address=address;
	}
	 //deposit
	public boolean deposit(int amt) {
		if(amt>=100 && amt % 100 == 0) {
			balance +=amt;
			return true;
		}
		else
			return false;
		
	}
	public int withdraw(int amt) {
		if(amt > balance)
			return 0;
		else if(amt>=100 && amt % 100 ==0) {
			balance-=amt;
			return 1;
		}
		else
			return -1;
		
		}
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
				+ ", accountType=" + accountType + ", address=" + address + "]";
	}

}
