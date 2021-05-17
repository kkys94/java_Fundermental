package java_20210511.step4;

public class StopMiliWatch {
	long startTime;
	long endTime;
	public void start() {
		startTime = System.nanoTime();
	}
	public void stop() {
		endTime = System.nanoTime();

	}
	public double getElapsedTime() {
		return (double)(endTime - startTime)/1000000000;
		
		
	}
}



