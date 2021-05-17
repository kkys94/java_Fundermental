package java_20210506;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.name = "강유선";
		c1.age = 28;
		c1.email = "kkys8640@gmail.com";
		c1.phone = "010-5445-8640";
		c1.balance = 1_000_000;
		c1.released = false;
		//클래스변수(static 변수)는 클래스 이름으로 접근하는 것이 관례
		//변수로도 접근 가능하나 권장하지 않음 예) c1.interestRate = 6.2;
		Customer.interestRate = 6.2;
		//final변수는 값을 재할당 할 수 없음
		//Customer.BANKNAME="국민은행";
		
		
		
		System.out.printf("%s,%d,%s,%s,%f,%s %n", c1.name,c1.age,c1.email,c1.phone,c1.balance,c1.released);
		
		Customer c2 = new Customer();
		
		c2.name = "손정의";
		c2.age = 30;
		c2.email = "uuuu20@gmail.com";
		c2.phone = "010-1234-8640";
		c2.balance = 5_000_000;
		c2.released = false;
		Customer.interestRate = 8.2;
		
		System.out.printf("%s,%d,%s,%s,%f,%s %n", c2.name,c2.age,c2.email,c2.phone,c2.balance,c2.released);
		
		
		Customer c3 = c2; 
		c3.name = "송정의1";
		
		System.out.printf("%s,%s",c2.name,c3.name);
		System.out.printf("%f",Customer.interestRate);
		
		
		}

	}
