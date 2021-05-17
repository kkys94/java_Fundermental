package java_20210514;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		m.insert("kkys94","강유선1",18);
		m.insert("kkys12","강유선2",28);
		m.insert("kkys24","강유선3",38);
		m.insert("kkys54","강유선4",48);
		
		ArrayList list = m.select();
		for(int i=0;i<list.size();i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n",
					m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===========================");
		m.delete("kkys94");
		for(int i=0;i<list.size();i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n",
					m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===========================");
		m.update("kkys12","강유선2",32);
		for(int i=0;i<list.size();i++) {
			Member m2 = (Member)list.get(i);
			System.out.printf("%s, %s, %d %n", 
					m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("===========================");
		
		
		Member m3 = m.select("kkys54");
		System.out.printf("%s, %s, %d %n", m3.getId(), m3.getName(), m3.getAge());						
		
		
		
	}
}
