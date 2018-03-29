import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class BankConsole {
	
	public static Scanner scanner;
	public static String input;
	public static ArrayList<Account> accounts;
	public static String fileName = "BankData.txt";
	


	public static boolean userCreateAccount = true;
	
	
	public enum ScreenState {
	    INITIAL_SS, LOGIN_SS, USERMENU_SS, CREATE_SS, BALANCE_SS, WITHDRAW_SS, DEPOSIT_SS, LOGOUT_SS
	}
	


	
	public static void Login() {
		
		System.out.println("---------------------------");
		System.out.println("------- Bank Login --------");
		System.out.println("---------------------------");
		System.out.println("Enter User Name to login: ");
	}
	
	public static void CreateAccountPrint() {
		
		System.out.println("---------------------------");
		System.out.println("---- Account Creation -----");
		System.out.println("---------------------------");
		System.out.println("Enter User Name to create: ");
	}
	
	public static void PrintLogOrCreate() {
		System.out.println("\n\n---------------------------");
		System.out.println("------- Selection ---------");
		System.out.println("---------------------------");
		System.out.println("1. Login");
		System.out.println("2. Create Account");
		System.out.println("---------------------------");
		System.out.println("Enter selection number: ");
		
		
	}
	
	public static void LogoutPrint(String s) {
		
		System.out.println("---------------------------");
		System.out.println(s+ " you are now logged out");
		System.out.println("---------------------------");

	}
	
	public static void WithdrawPrint() {
		
		System.out.println("---------------------------");
		System.out.println("-------- Withdraw ---------");
		System.out.println("---------------------------");
		System.out.println("How much would you like to withdraw: ");

	}
	
	public static void DepositPrint() {
		
		System.out.println("---------------------------");
		System.out.println("-------- Deposit ----------");
		System.out.println("---------------------------");
		System.out.println("How much would you like to deposit: ");

	}
	
	public static void PrintMenu(String uName) {
		System.out.println("\n\n---------------------------");
		System.out.println("------- Selection ---------");
		System.out.println("---------------------------");
		System.out.println("Welcome " + uName );
		System.out.println("1. View Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Log out");
		System.out.println("---------------------------");
		System.out.println("Enter selection number: ");
	}

	public static void main(String[] args) throws IOException {
		
		ScreenState screenState = ScreenState.INITIAL_SS;
		
		accounts = new ArrayList<Account>();
		
		String userNameCurrentlyLoggedIn = "";
		String capturedString = "";
		int capturedInt = 0;
		float capturedFloat = 0.0f;
		boolean isUserLoggedIn = false;
		Init();

		
		OpenFile();
		
		//OpenFile(fileName);
		
		while (true) {
			switch (screenState){
			case INITIAL_SS:
				PrintLogOrCreate();
				
				while(true) {
					capturedInt = GetInt();
					if (capturedInt == 1) {
						screenState = ScreenState.LOGIN_SS;
						break;
					}
					else if (capturedInt ==2) {
						screenState = ScreenState.CREATE_SS;
						break;
					}
					else {
						System.out.println("Enter 1 or 2: ");
					}
				}
				break;
			case LOGIN_SS:
				Login();
				capturedString = GetString();
				if (IsUsernameValid(capturedString)) {
					System.out.println("Please Enter A valid User Name");
					screenState = ScreenState.INITIAL_SS;
				}
				else {
					userNameCurrentlyLoggedIn = capturedString;
					CreateAccount(userNameCurrentlyLoggedIn);
					screenState = ScreenState.USERMENU_SS;
				}
				break;
			case USERMENU_SS:
				PrintMenu(userNameCurrentlyLoggedIn);
				capturedInt = GetInt();
				while (true) {

					if (capturedInt == 1) {
						screenState = ScreenState.BALANCE_SS;
						break;
					} else if (capturedInt == 2) {
						screenState = ScreenState.WITHDRAW_SS;
						break;
					} else if (capturedInt == 3) {
						screenState = ScreenState.DEPOSIT_SS;
						break;
					} else if (capturedInt == 4) {
						screenState = ScreenState.LOGOUT_SS;
						break;
					} else {
						System.out.println("Enter 1 - 4 ");
					}
				}
				
				break;
			case CREATE_SS:
				CreateAccountPrint();
				capturedString = GetString();
				CreateAccount(capturedString);
				screenState = ScreenState.INITIAL_SS;
				break;
			
			case BALANCE_SS:
				Balance(userNameCurrentlyLoggedIn);
				screenState = ScreenState.USERMENU_SS;
				break;
			case WITHDRAW_SS:
				WithdrawPrint();
				capturedFloat = GetFloat();
				Withdraw(userNameCurrentlyLoggedIn, capturedFloat);
				screenState = ScreenState.USERMENU_SS;
				break;
			case DEPOSIT_SS:
				DepositPrint();
				capturedFloat = GetFloat();
				Deposit(userNameCurrentlyLoggedIn, capturedFloat);
				screenState = ScreenState.USERMENU_SS;
				break;
			case LOGOUT_SS:
				LogoutPrint(userNameCurrentlyLoggedIn);
				screenState = ScreenState.INITIAL_SS;
				break;
				
		} // End Switch
	} // End Endless For	
} // End Main
		
		//Login();
		//Menu();
		
		
	
	
	
	public static int GetInt() {
		int intInput;
		while (true) {
			if (scanner.hasNextInt()) {
				intInput = scanner.nextInt();
				break;
			} else {
				System.out.println("Bad input, enter int value:");
				scanner.next();
			}
		}
		return intInput;
		
	}
	
	public static float GetFloat() {
		
		float floatInput;
		while (true) {
			if (scanner.hasNextFloat()) {
				floatInput = scanner.nextFloat();
				break;
			} else {
				System.out.println("Bad input, enter float value:");
				scanner.next();
			}
		}
		return floatInput;
	}
	
	public static String GetString() {
		String floatInput;
		while (true) {
			if (scanner.hasNext()) {
				floatInput = scanner.next();
				break;
			} else {
				System.out.println("Bad input, enter String value:");
				scanner.next();
			}
		}
		return floatInput;
	}
	
	
	public static void Init() {
		
		scanner = new Scanner(System.in);
		
		
	}
	
	public static void WriteFile(){
		
		BufferedWriter output;
		try {
			output = new BufferedWriter(new FileWriter(fileName));
			
			for (Account i : accounts) {
				output.write(i.userName + ":" + i.balance + "\n");
			}
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	public static void OpenFile() {
		
		ArrayList<String> lines = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
            	lines.add(line);
            }
        } catch (IOException e) {
        	e.printStackTrace();
		}
        
        for(String i : lines) {
        	String cutString [] = i.split(":");
        	accounts.add(new Account(cutString[0], Float.parseFloat(cutString[1])));
        }   
		
	}
	
	public static boolean IsUsernameValid(String uName) {
		
		for (Account i : accounts) {
			if(i.userName.equals(uName))return false;
		}
		return true;
	}
	
	public static void CreateAccount(String s) {
		
		if (IsUsernameValid(s)) {
			accounts.add(new Account(s, 0.0f));
		} else {
			System.out.println("account name in use");
		}
		
		
	}
	
	public static void Deposit(String uName, float amount) {
		
		for (Account i : accounts) {
			if(i.GetUserName().equals(uName)) {
				
				if(i.DepositMoney(amount)) {
					WriteFile();
					System.out.println("Successfully Deposited " + amount);
					System.out.println("Account Balance is now " + i.GetBalance());
				} else {
					System.out.println("Cannot deposit negative funds");
				}
			}
		}

	}
	
	public static void Withdraw(String uName, float amount) {
		
		for (Account i : accounts) {
			if(i.GetUserName().equals(uName)) {
				if(i.WithdrawMoney(amount)) {
					WriteFile();
					System.out.println("Successfully Withdraw " + amount);
					System.out.println("Account Balance is now " + i.GetBalance());
				} else {
					System.out.println("Cannot deposit negative funds");
				}
			}
		}
		
	}
	
	public static void Balance(String uName) {
		for (Account i : accounts) {
			if(uName.equals(i.userName)) {
				System.out.println("Current Blalance for " + uName + " is " + i.GetBalance());
			}
		}
	}
	
}
