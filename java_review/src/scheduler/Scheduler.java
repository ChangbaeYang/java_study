package scheduler;

public interface Scheduler {
	public void getNextCall();		// 다음 전화를 가져오는 기능
	public void sendCallToAgent();	// 상담원에게 전화를 분배하는 기능
}
