package Lop;

import java.sql.Date;
import java.util.Calendar;

public class StopWatch {
	private long startTime ;
	private long endTime;
	
	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public StopWatch() {
		// TODO Auto-generated constructor stub
	}
	
	public void  start() {
		startTime = Calendar.getInstance().getTimeInMillis();
		 
	}
	public void  end() {
		endTime = Calendar.getInstance().getTimeInMillis();
		 
	}
	public long getElapsedTime() {
		
		return endTime - startTime;
	}
}
