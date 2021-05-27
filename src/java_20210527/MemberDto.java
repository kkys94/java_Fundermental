package java_20210527;
//1.member table 객체화 
//2. a. 매개변수를 줄일 목적 
//   b. 테이블 한개의 row  정보를 객체화 하기 위한 목적 
public class MemberDto {
	//member table 의 컬럼을 멤버변수로 설정한다.
	private int num;
	private String name;
	private String addr;
	public MemberDto() { //default constructor 매개변수 없는 생성자  
	//alt shift s - c
		super();
		// TODO Auto-generated constructor stub
		
	} //alt shift s - o 
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	} //alt shit s gitter setter 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
