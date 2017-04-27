package tv;

public class WatchTv {
	public static void main(String[] args) {
		TV tv = new TV( 7, 20, false);  	
		
		tv.status(); //초기 설정 확인 
		
		tv.power(true); //전원을 킨다.
		tv.volume(120); //볼륨이 120으로 변경하면 볼륨은 1로 변경
		tv.status(); //상태 확인
		
		tv.volume(false); //볼륨을 -1
		tv.status(); //상태 확인
		
		tv.channel(0); //채널을 0으로 바꾼다. = 255로 변환
		tv.status(); //상태확인
		
		tv.channel(true); //채널을 1씩 증가
		tv.channel(true);
		tv.channel(true);
		tv.status(); //상태 확인
		
		tv.power(false); //전원을 끈다.
		tv.status(); //상태확인
    }
}