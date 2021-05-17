package java_20210429;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 컴파일 에러 발생
		//byte b1 = 128;
		//정수형 리터럴(byte,short,int)은 2진수, 8진수, 10진수, 16진수가 있음
		int a1 = 128;//10진수 표기법
		int a2 = 076;//8진수 표기법
		int a3 = 0x123;//16진수 표기법
		int a4 = 0b111;//2진수 표기법
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long 리터럴은 숫자 뒤에 1,L로 표기함
		long a5 = 2200000000L;
		
		//10진수를 표기할때 3자리로 '_;를 사용할 수 있음
		int a6 = 1_000_000;
		
		//float 리터럴은 소숫점뒤에 f,F로 표기함
		float f1 = 1234.43f;
		
		//double 리터럴은 소수점 뒤에 d,D로 표기함(생략가능)
		double d1 = 1234.45;
		
		//boolean 리터럴은 true,false
		boolean isExcited = false; 
		
		
		
	}

}
