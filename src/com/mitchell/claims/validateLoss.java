package com.mitchell.claims;

import javax.xml.datatype.XMLGregorianCalendar;

import com.mitchell.examples.claim.CauseOfLossCode;
import com.mitchell.examples.claim.LossInfoType;
import com.mitchell.examples.claim.MitchellClaimType;

public class validateLoss {
	
	static boolean isValid = true;
	
	public static boolean validate(LossInfoType lossInfo) {
		
		//Cause of Loss
		CauseOfLossCode causeOfLoss = lossInfo.getCauseOfLoss();
		
		if(!(causeOfLoss.equals(CauseOfLossCode.COLLISION)
				|| causeOfLoss.equals(CauseOfLossCode.EXPLOSION)
				|| causeOfLoss.equals(CauseOfLossCode.FIRE)
				|| causeOfLoss.equals(CauseOfLossCode.HAIL)
				|| causeOfLoss.equals(CauseOfLossCode.MECHANICAL_BREAKDOWN)
				|| causeOfLoss.equals(CauseOfLossCode.OTHER))){
			isValid = false;
		}
		
		//Reported Date
		XMLGregorianCalendar dateTime = lossInfo.getReportedDate();
		if(dateTime == null){
			isValid = false;
		}
		
		//Loss Description
		String lossDescription = lossInfo.getLossDescription();
		if(lossDescription.isEmpty()){
			isValid = false;
		}
		
		return isValid;
		
	}
}
