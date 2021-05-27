package java_20210527;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		
		int num = 12;
		String name = "김범수1";
		String addr = "한국1";
		MemberDto dto = new MemberDto(num, name,addr);
		boolean success = dao.update(dto);
		if(success) {
			System.out.println("update 성공");
		}else {
			System.out.println("update 실패");
		}
	
	}
}
