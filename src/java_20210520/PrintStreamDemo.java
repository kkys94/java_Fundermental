package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null; //file. (destination -> file)모니터 아님. 생성 방법이 다름. 
		PrintStream ps1 = null; //모니터 (destination -> monitor)
		
		ps1 = System.out; //모니터 
		ps1.println("hello");
		ps1.println("안녕하세요");
		
		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			bis = new BufferedInputStream(fis); // Stream chaining. 
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy1.zip");
			bos = new BufferedOutputStream(fos); //stream chaining.
			
			//PrintStream
			//1.PrintStream의 메소드는 IOException 발생하지 않는다. 
			//2.Auto flush 기능을 가지고 있음. => true 라는 조건이 있어야 한다.
			ps = new PrintStream(bos, true);//stream chaining.
			
			int readByte = 0;
			try {
				while((readByte = bis.read()) != -1) {
					ps.write(readByte);            //file 출력. monitor -> ps1 
				}
				//ps.flush(); 앞에 true가 있어서 필요 없음  
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis !=null) fis.close();
				if(bis !=null) bis.close();
				
				if(fos !=null) fos.close();
				if(ps != null) ps.close();
				if(bos !=null) fos.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
