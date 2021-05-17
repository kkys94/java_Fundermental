package java_20210510;

public class MemberDemo {
	public static void print(Member m) {

		String name = m.getName();
		String email = m.getEmail();
		String zipcode = m.getZipcode();
		String addr1 = m.getAddr1();
		String addr2 = m.getAddr2();
		int age = m.getAge();
		System.out.println(name);
		System.out.println(email);
		System.out.println(zipcode);
		System.out.println(addr1);
		System.out.println(addr2);
	}
	
	
	public static void main(String [] args) {
		Member m = new Member();
		//m.name = "강유선";
		m.setName("강유선");
		m.setEmail("kkys8640@gmail.com");
		m.setZipcode("04057");
		m.setAddr1("서울 마포구 동교동");
		m.setAddr2("188-5");
		m.setAge(28);
		print(m);
		

		
	}
 }
