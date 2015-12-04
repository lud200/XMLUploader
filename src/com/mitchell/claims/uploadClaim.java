package com.mitchell.claims;

import java.sql.*;

import javax.xml.datatype.XMLGregorianCalendar;

import com.mitchell.examples.claim.MitchellClaimType;
import com.mitchell.examples.claim.StatusCode;
public class uploadClaim {
	public static void uploadClaims(){
		String myURL = "jdbc:mysql://localhost:3306/mitchell";
		
		try {
			
			Connection con = DriverManager.getConnection(myURL, "root", "");
			
			MitchellClaimType claimType = generateClaimObject.generateObject();;
			
			String sql = "INSERT INTO `mitchellclaim`(ClaimNumber, ClaimantFirstName, ClaimantLastName, Status, LossDate, AssignedAdjusterID) VALUES(?, ?, ?, ?, ?, ?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			
			String claimNumber = claimType.getClaimNumber();
			String firstName = claimType.getClaimantFirstName();
			String lastName = claimType.getClaimantLastName();
			StatusCode status = claimType.getStatus();
			String statuscode = status.toString();
			XMLGregorianCalendar date = claimType.getLossDate();
			java.sql.Date date1 = new java.sql.Date(0);
			Long adjusterID = claimType.getAssignedAdjusterID();
			
			preparedStatement.setString(1, claimNumber);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, lastName);
			preparedStatement.setString(4, statuscode);
			preparedStatement.setDate(5, date1);
			preparedStatement.setLong(6, adjusterID);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Update Successful");
		} 
		
		catch (SQLException e) {
			System.out.println("Connection cannot be established");
			e.printStackTrace();
		}
	}
	
}
