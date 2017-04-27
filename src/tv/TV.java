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
	public int getChannel() { //범위 계산
		if(channel>255){
			channel=1;
		}
		else if(channel<1){
			channel=255;
		}
		return channel;
	}
	public int getVolume() { //
		if(volume>100){
			volume=1;
		}
		else if(volume<1){
			volume=100;
		}
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	public void status() {
		System.out.println("channel : "+channel);
		System.out.println("volume : "+volume);
		System.out.println("power : "+power);
	}
	public void power(boolean b) {
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
	public void volume(int i) {
		volume=i;
		getVolume();
	}
	public void volume(boolean i){
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
	public void channel(int i){
		channel=i;
		
//		if(channel>255){
//			channel=1;
//			getChannel();
//		}
//		else if(channel<1){
//			channel=255;
//			getChannel();
//		}
		getChannel();
	}
	public void channel(boolean i){
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
