package tv;

public class WatchTv {
	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false);  	
		//System.out.println("------- 1번째상태 변화x");
		tv.status();
		//System.out.println("------- 2번쨰상태 파워 트루 볼륨 120=볼륨1");
		tv.power(true);
		tv.volume(120);
		tv.status();
		//System.out.println("------- 3번째상태 볼륨false");
		tv.volume(false);
		tv.status();
		//System.out.println("------- 4번째상태 채널0");
		tv.channel(0);
		tv.status();
		//System.out.println("------- 5번째상태 채널+3");
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		//System.out.println("------- 5번째상태 파워 오프");
		tv.power(false);
		tv.status();
    }
}