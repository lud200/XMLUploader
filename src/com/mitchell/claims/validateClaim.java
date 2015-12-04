package com.mitchell.claims;

import com.mitchell.examples.claim.*;
import com.mitchell.claims.generateClaimObject;

import java.io.*;
import java.util.*;

import javax.xml.datatype.XMLGregorianCalendar;

public class validateClaim {
	
	public boolean validate(){

		MitchellClaimType claimType = generateClaimObject.generateObject();
		
		boolean isValid = true;
		
		//ClaimNumber
		String claimNumber = claimType.getClaimNumber();
		if(claimNumber.isEmpty()){
			isValid = false;
		}
		
		//FirstName
		String firstName = claimType.getClaimantFirstName();
		if(firstName.isEmpty()){
			isValid = false;
		}
		
		//LastName
		String lastName = claimType.getClaimantLastName();
		if(lastName.isEmpty()){
			isValid = false;
		}
		
		//Status
		StatusCode status = claimType.getStatus();
		if(!(status.equals(StatusCode.OPEN) || status.equals(StatusCode.CLOSED))){
			isValid = false;
		}
		
		//LossDate
		XMLGregorianCalendar date = claimType.getLossDate();
		if(date == null){
			isValid = false;
		}
		
		//AdjusterID
		Long adjusterID = claimType.getAssignedAdjusterID();
		if(adjusterID == null){
			isValid = false;
		}
		
		LossInfoType lossInfo = claimType.getLossInfo();
		if(lossInfo != null){
			isValid = validateLoss.validate(lossInfo);
		}
		
		if(isValid){
			uploadClaim.uploadClaims();
			uploadLossInfo.uploadLoss(lossInfo);
		}
		return isValid;
	}
}
