package com.deloitte;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	@Value("2.5")
	private float smsCharge;
	@Value("5.6")
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
