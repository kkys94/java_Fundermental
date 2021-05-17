package java_20210514;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //특정컬랙션에 원하는 객체자료 명시 -> generic
		list.add("1");
		list.add("2");
		list.add("3");
		//list.add(3); //auto-boxing 
		list.add("4");
		
		
		
		for(int i=0;i<list.size();i++) {
			String value = list.get(i); //캐스팅 할 필요가 없음
			System.out.println(value);
		}
		for(String value : list) {
			System.out.println(value);
		}
	}
}
