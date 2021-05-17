package java_20210510;

public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin("kkys94","123", "kkys8640@gmail.com", 28);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
	
		
		Admin a1 = new Admin();
		a1.setId("kkys94");
		a1.setPwd("123");
		a1.setEmail("kkys8640@gmail.com");
		a1.setLevel(28);
		
		
		
		
	}
}
