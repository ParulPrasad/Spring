package com.deloitte;

public class MessageSender {
	private float smsCharge;
	private float mmsCharge;
	public float getSmsCharge() {
		return smsCharge;
	}
	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}
	public float getMmsCharge() {
		return mmsCharge;
	}
	public void setMmsCharge(float mmsCharge) {
		this.mmsCharge = mmsCharge;
	}
	public void sendSms() {
		System.out.println("Sms sent...charged= "+smsCharge);
		
	}
	public void sendMms() {
		System.out.println("Mms sent...charged= "+mmsCharge);
		
	}

}
