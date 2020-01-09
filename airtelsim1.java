package com.deloitte;

import org.springframework.beans.factory.annotation.Autowired;

public class AirtelSim implements Sim{
	private float callCharge;
	private float speed;
	@Autowired
	private MessageSender ms;
	
	public void sendSms() {
		ms.sendSms();
		System.out.println("from Airtel");

	}
	public void sendMms() {
		ms.sendMms();
		System.out.println("from Airtel");
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
		System.out.println("calling from airtel...Speed "+speed+" mbps");
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browsing from airtel...Charges "+callCharge+" per min");
	}

}
