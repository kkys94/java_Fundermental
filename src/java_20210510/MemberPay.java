package java_20210510;

public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status;
	private String sdate; 
	private String edate;
	private String regdate;
	
	//seq의 setter => seq를 수정할 때 사용
	public void setSeq(int seq) {
		//this를 사용한 이유는 로컬 변수와 멤버 변수를 구분하기 위해서 사용
		this.seq = seq; //왼쪽은 멤버 변수고 오른쪽은 로컬 변수
	}
	//seq의 getter => seq의 정보를 가져올 때 사용
	public int getSeq() {
		return seq; //this.seq 여기에 seq없으니 this 생략가능
	}
	
	//group의 setter
	public void setGroup(int group) {
		this.group = group; 
	}
	//group의 getter 
	public int getGroup() {
		return group;
	}
	//name의 setter
	public void setName(String name) {
		this.name = name;
	}
	//name의 getter
	public String getName() {
		return name;
		
	}
	
	//price의 setter생성
	public void setPrice(int price) {;
		this.price = price;
	}
	//price의 getter생성
		public int getPrice() {
			return price; 
		}
	//valid의 setter
	public void setValid(boolean valid) {;
		this.valid = valid;
	}
	//valid의 getter => valid 자료형이 boolean일 ㅕㅇ우 getxxx아니라 isxxx로 생성 
	public boolean isValid() {
		return valid;
	}
	//sdate setter
	public void setSdate(String sdate) {
		this.sdate = sdate; 
	}
	//sdate getter
	public String getSdate() {
		return sdate;
	}
	//status setter
	public void setStatus(String status) {
		this.status = status;
	}
	//status getter
	public String getStatus() {
		return status;
	}
		
	//edate setter
	public void setEdate(String edate) {
		this.edate = edate;
	}
	//edate getter
	public String getEdate() {
		return edate;
	}
	//regdate setter
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;
	}

	}

