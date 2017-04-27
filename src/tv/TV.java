package tv;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int i, int j, boolean b) {//생성자
		channel=i;
		volume=j;
		power=b;
	}
	public int getChannel() { // 채널은 1~255까지 진행 1보다 아래면 255로 바뀌고 255보다 크면 1로 바뀜
		if(channel>255){
			channel=1;
		}
		else if(channel<1){
			channel=255;
		}
		return channel;
	}
	public int getVolume() { // 유효범위 1~100 100이상이면 1로 바뀌고 1이하면 100으로 바뀜
		if(volume>100){
			volume=1;
		}
		else if(volume<1){
			volume=100;
		}
		return volume;
	}
	public boolean isPower() { //전원 on/off
		return power;
	}
	public void status() { //현재 상태 확인 
		System.out.println("channel : "+channel);
		System.out.println("volume : "+volume);
		System.out.println("power : "+power);
	}
	public void power(boolean b) { //전원 변경 
		power=b;
		if(power==true){
			isPower();
			power=true;
		}
		else if(power==false){
			isPower();
			power=false;
		}
	}
	public void volume(int i) { //유효범위 계산은 게터에서 진행 
		volume=i;
		getVolume();
	}
	public void volume(boolean i){ //참이면 +1 ,거짓이면 -1
		boolean temp=i;
		if(temp==true){
			getVolume();
			volume=volume+1;
		}
		else{
			getVolume();
			volume--;
		}
	}
	public void channel(int i){ //유효범위는 게터에서 진행
		channel=i;
		getChannel();
	}
	public void channel(boolean i){ //참이면 +1 거짓이면 -1
		boolean temp = i;
		if(temp=true){
			getChannel();
			channel++;
		}
		else if(temp=false){
			getChannel();
			channel--;
		}
	}
}
