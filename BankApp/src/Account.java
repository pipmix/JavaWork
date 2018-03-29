
public class Account {
	public String userName = "";
	public float balance;
	
	Account(String s, float b){
		this.userName = s;
		this.balance = b;
	}
	
	public boolean DepositMoney(float f) {
		
		if (f < 0.0f)return false;
		
		this.balance += f;
		return true;
	}
	
	public boolean WithdrawMoney(float f) {
		
		if (f > this.balance)return false;
		
		this.balance -= f;
		return true;
	}
	
	public String GetUserName() {
		return this.userName;
	}
	
	public float GetBalance() {
		return this.balance;
	}
	
	
	
}
