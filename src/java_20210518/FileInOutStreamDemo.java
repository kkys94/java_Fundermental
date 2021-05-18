package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamDemo {
public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	try {
		fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\jdk_bin.exe");
		//매개변수path의 디렉토리가 존재하지 않으면 예외 발생
		//예외가 발생하지 않고 객체가 생성되면 파일을 생성한다
		//이때 무조건 빈파일을 생성함
				
		fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\jdk_bin-copy.exe");
		
		/*
		System.out.printf("경과시간 : %d %n", (end-start));
		
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*100];
		long start = System.currentTimeMillis();
		while ((readByteCount = fis.read(readBytes)) != -1) {
			fos.write(readBytes,0,readByteCount);
			
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
			if(fis != null) fis.close();
			if(fos != null) fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
