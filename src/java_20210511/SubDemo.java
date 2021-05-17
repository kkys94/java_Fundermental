package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool(); 
		
		sub.play("~~~");  
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		
		Super sup1 = new Sub();
		System.out.println(sup.money);
		sup1.makeMoney();
		sup1.play("~~");
		
		System.out.println(sub);
		System.out.println(sub.toString()); //object class에 있는 메소드 - toString 재정의해야해
		
		Object obj = new Sub();
		System.out.println(obj.toString());
		
	}

}
