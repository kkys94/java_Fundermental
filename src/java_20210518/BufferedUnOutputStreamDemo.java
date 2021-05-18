package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedUnOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//1.FileInputStream과 FileOutputStream을 이용하여 
			//1바이트 읽어서 1바이트 출력한 예제이고 그 결과 경과시간은 
			//69327 밀리세컨드 이다.
			//파일 크기는 11,756kb파일
			fis = new FileInputStream(
					"C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			fos = new FileOutputStream(
					"C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46-copy.zip");
			/*
			int readByte = 0;
			long start = System.currentTimeMillis();
			while ((readByte = fis.read()) != -1) {
				fos.write(readByte);
				
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d %n", (end-start));
			*/
			
			//2.BufferedInputStream과 BufferedOutputStream을 이용하여
			//1 바이트씩 읽어서 1바이트 출력한 예제
			//경과시간 : 243밀리세컨드, 파일크기 : 11,756kb
			//BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차 있으면 출력.
			// 만약 다 채워지지 않으면 출력하지 않음
			// 이런경우 flush() 메서드를 호출하여 모두 출력.
		
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			int readyByte = 0;
			long start = System.currentTimeMillis();
			while((readyByte = bis.read()) != -1) {
					bos.write(readyByte);
			}
			bos.flush();
			
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d %n", (end-start));
			
			
			//경과시간 : 16 밀리세컨즈, 파일크기 : 11,756kb
			
			/*
			int readByteCount = 0;
			byte[] readBytes = new byte[1240*10];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d %n", (end-start));
			*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(fis !=null) fis.close();
					if(bis !=null) bis.close();
					
					if(fos !=null) fos.close();
					if(bos !=null) fos.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
}
}
