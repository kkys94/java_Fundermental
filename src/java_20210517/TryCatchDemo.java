package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg = (double)sum / 2; //한쪽만 double 해도 됨.
		return avg; 
	}
	//javac TryCatchDemo.java => compile하는 방법
	//java TryCatchDemo 10,20,30 => argument 
	//run configurations => arguments - program arguments 에 값을 넣어야 함  (10,20 넣음)
	//10 a(20대신 a넣음) -> java.lang.NumberFormatException ERROR! 
	// 10 (10만 넣엇을때. arg[1]값이 없음. -> java.lang.ArrayIndexOutOfBoundsException ERROR! 
	
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]);
		
			double average = getAvgs(korean, english);
		
			System.out.printf("국어와 영어의 평균 점수는 %.1f 입니다.", average);
		}catch(NumberFormatException e ) {
			//catch 블럭의 수행문을 만들때 2가지 형태로 코딩한다. 
			//1. 에러 메시지를 출력 (개발자)
			//2. 에러 메세지를 출력 (사용자) 
			//e.printStackTrace();             // error stack 전체 메시지를 다 볼 수 있음              // 개발자단계
			//System.err.println(e.getMessage()); //error 메세지만 볼수잇음 /system.err.println ->err // 개발자단계
			System.err.print("똑바로해!!ㅠㅠ");                                                 //서비스단계
		}catch(ArrayIndexOutOfBoundsException e ) {
			//e.printStackTrace();             // error stack 전체 메시지를 다 볼 수 있음                      //개발자단계
			//System.err.println(e.getMessage()); //error 메세지만 볼수잇음 /system.err.println ->err        //개발자단계
			System.err.print("인자 2개가 필요해!");                                                        //서비스단계
		}finally {
			System.out.println("무조건 수행되는 블럭 - finally");
		}
	}
}
