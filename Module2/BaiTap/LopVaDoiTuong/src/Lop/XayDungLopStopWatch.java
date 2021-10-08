package Lop;

public class XayDungLopStopWatch {
public static void main(String[] args) {
	StopWatch s1 = new StopWatch();
	s1.start();
	for(int i= 0; i < 1000000; i++) {
		
	}
	s1.end();
	long date = s1.getElapsedTime();
	System.out.println(date);
}
}
