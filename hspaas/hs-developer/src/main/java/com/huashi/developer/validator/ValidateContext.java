package com.huashi.developer.validator;

public class ValidateContext {

	public enum BusinessType {
		
		BUILD_CHILD_USER, PLATFORM_BALANCE, 
		
		SMS_SEND, SMS_BATCH_SEND, SMS_BALANCE, SMS_CALLBACK_STATUS_RECORD, SMS_CALLBACK_MO_RECORD, SMS_API_STATUS_CODE,
		
		FLUX_CHARGE, FLUX_BATCH_CHARGE, FLUX_BALANCE, FLUX_CALLBACK_CHARGE_RECORD, FLUX_API_STATUS_CODE,
		
		VOICE_SEND, VOICE_CALLBACK_STATUS_RECORD
	}
}
