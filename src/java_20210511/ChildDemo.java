package java_20210511;

public class ChildDemo {
	public static void main(String[] args) {
		Child child = new Child("010-1234-5678",50.3,155.2);
		
		System.out.println(child.name);
		System.out.println(child.address);
		System.out.println(child.age);
		System.out.println(child.phone);
		System.out.println(child.weight);
		System.out.println(child.height);
		
		Child child2 
		= new Child("강유선","서울",28,"010-1234-5678",50.3,155.2);
		
	}
	
}
