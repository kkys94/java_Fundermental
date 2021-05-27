package java_20210524;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketScan {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		for(int port=1;port<65536;port++) {
			
			
				try { 
					//ServerSocket 클래스는 해당 서버의 port번호를 사용 할 수 있으면
					//ServerSocket 인스턴스를 사용 할 수 있고
					//그렇지 않으면 예외를 발새한다. 즉 예외가 발생했다는 얘기는 
					//해당 port를 사용하고 있다는 것 
					serverSocket = new ServerSocket(port);
				} catch (IOException e) {
					 System.err.println(port+"번호를 사용중이다."); //사용 할 수 없다.
					}
				}
		}
	}

