package java_20210517;

public class ThrowDemo {
	public static double withdraw(String account, int amount) 
		throws InsufficientBalanceException,IncorrectAccountException{
		double myBalance = 10000;
		String myAccount = "123-123-1234567"; //계좌랑 발란스가 다른 상황
		if(myAccount.equals(account)) {   //myaccount 랑 account 같아야함
			if(myBalance - amount >= 0) {
				myBalance -= amount;
			}else {
				//return -1;
				throw new InsufficientBalanceException("잔고가부족합니다.");
			}
		}else {                            //만약 다르면?? 
			throw new IncorrectAccountException("잘못된 계좌번호 입니다.");
		}
		return myBalance;		
	}
	public static void main(String[] args) {
		double balance = 0;
		
		try {
			balance = withdraw("123-123-123456", 9000); 
			System.err.printf("잔고 : ,.2f", balance);
		}catch(InsufficientBalanceException e) {
				System.err.println(e.getMessage());
		} catch(IncorrectAccountException e) {
			System.err.println(e.getMessage());
			}
	}
}
