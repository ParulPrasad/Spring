package com.deloitte;

public class JioSim implements Sim {
	private float callCharge;
	private float speed;
    private MessageSender ms;
	
	public void sendSms() {
		ms.sendSms();
		System.out.println("from Jio");

	}
	public void sendMms() {
		ms.sendMms();
		System.out.println("from Jio");
	}
	

	public MessageSender getMs() {
		return ms;
	}
	public void setMs(MessageSender ms) {
		this.ms = ms;
	}
	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling from jio...Charges "+callCharge+" per min");
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browsing from jio...Speed "+speed+" mbps");
	}

}
