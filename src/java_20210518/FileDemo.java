package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static String format(File f) {
		//last modified1970년 1월 1일 00:00:00초부터 파일을 수정한 날까지의 시간을
		//밀리세컨드로 반환한 값.
		long lastmodified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastmodified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String format = sdf.format(cal.getTime());
		return format;
				
	}
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\test\\2021\\05\\18");
		if(f1.mkdirs()) {
				System.out.println("디렉토리를 생성 했습니다.");
		}else {
			System.out.println("이미 디렉토리가 존재합니다.");
		}

		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\jdk_bin.exe");
		long len = f2.length();
		System.out.printf("%,dKB%n", len/1024);
		boolean isFile = f2.isFile(); //isDirectory()
		if(isFile) {
			String path = f2.getPath();
//			System.out.println(path);
	if(path.endsWith("zip")) {		
			System.out.println("파일입니다.");
		}else if(path.endsWith("text")){ 
		System.out.println("텍스트파일");
		}else if(path.endsWith("java")) {
			System.out.println("자바파일");
		}
		}else {
			System.out.println("디팩토리입니다");
		}
		//1970년 1월 1일 00:00:00초부터 파일을 수정한 날까지의 시간을
		//밀리세컨드로 반화한 값.
//		long lastmodified = f2.lastModified();
//		Calendar cal = Calendar.getInstance();
//		cal.setTimeInMillis(lastmodified);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
//		String format = sdf.format(cal.getTime());
//		System.out.println(format);
				
		System.out.println(format(f2));
				
				
		
			File f3 = new File("c:\\dev\\test\\2021\\05\\18\\jdk_bin2.exe");
			File f4 = new File("c:\\dev\\test\\2021\\05\\18\\", "jdk_bin3.exe");
			f3.renameTo(f4); //f3파일을 f4파일 이름으로 변경 
			
	String path = f4.getPath();
	String parent = f4.getParent();
	String name = f4.getName();
	System.out.printf("%s , %s , %s%n", path, parent, name);
	
	f4.delete();
	
	File f5 = new File("C:\\Users\\user\\eclipse-workspace\\java_Fundermental");
	
	File[] files = f5.listFiles();
	for(int i=0;i<files.length;i++) {
		File f = files[i];
		if(f.isDirectory()) {
			String lastModified = format(f);
			String filename = f.getName();
			System.out.printf("%s, %s ,파일폴더%n",filename,lastModified);
		}else if(f.isFile()) {
			String lastModified = format(f);
			String filename = f.getName();
			long fileSize = f.length();
			System.out.printf("%s, %s ,파일, %,dB %n",filename,lastModified,fileSize);
		}
	}
	
	
		}
	}


