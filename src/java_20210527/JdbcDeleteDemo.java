package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		//1.드라이버로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
	
	
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		//2.데이터베이스와 연결 할 수 있는 connection객체 생성
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/kpc", //url
					"kpc12", //user
					"kpc1212"); //password
			
			
			
			//3. SQL을 전송할 수 있는 PreparedStatement객체를 생성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM member "); //heidi로 먼저 작성, 성공하면 복사해서 붙이기 //문장끝에 한칸 띄우기 
			sql.append("WHERE num = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			//4. 바인딩변수를 설정
			int index = 1;
			pstmt.setString(index, String.valueOf(11));
			
			//5.SQL문을 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행이 수 : "+resultCount);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			
				try {
					//6. 모든 자원을 반납
					if(con != null) con.close();
					if(pstmt != null)pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
