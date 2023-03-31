package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{
	
	
	public void powerOn() {
		System.out.println("-->삼성 TV 켜기");
		
	}

	public void powerOff() {
		System.out.println("-->삼성 TV 끄기");
		
	}

	public void volumeUp() {
		System.out.println("-->삼성 TV 볼륨 업");
		
	}

	public void volumeDown() {
		System.out.println("-->삼성 TV 볼륨 다운");
		
	}

	
}
