package java_20210511.step3;

public class StopNanoWatch {
	long startTime;
	long endTime;
	public void start() {
		startTime = System.nanoTime();
		
	}
	public void stopNano() {
		endTime = System.nanoTime();
		
	}
	
	public double getElapsedNanoTime() {
		return (double)(endTime - startTime)/1000000000;
		
}
}