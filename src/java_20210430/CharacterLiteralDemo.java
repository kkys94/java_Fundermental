package java_20210430;

public class CharacterLiteralDemo {
	public static void main(String[] arges) {
		//char 리터럴 = 문자표현법
		char c1 = '강';
		char c2 = '유';
		char c3 = '선';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//리터럴 = 유니코드 표현법
		char c4 = '\uac15';
		char c5 = '\uc720';
		char c6 = '\uc120';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		//char 리터럴 = 아스키코드 표현법
	
		
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		
		//문자중에 사용할 수 없는 문자는 ',\
		//사용하기 위해서는 \를 사용해야한다.
		char c10 = '\'';
		char c11 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		
		
		//특수문자 \t \n
		
		System.out.print("안녕하세요.\n저는 강유선입니다. \n잘 부탁드립니다.\n");
		System.out.println("아이디\t이름\t지역");
		System.out.println("kkys8640\t강유선\t서울");
		
		
	}
}
