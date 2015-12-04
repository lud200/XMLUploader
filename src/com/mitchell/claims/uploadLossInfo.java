package com.mitchell.claims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.datatype.XMLGregorianCalendar;

import com.mitchell.examples.claim.LossInfoType;
import com.mitchell.examples.claim.MitchellClaimType;
import com.mitchell.examples.claim.StatusCode;

public class uploadLossInfo {
	
	public static void uploadLoss(LossInfoType lossInfo){
		String myURL = "jdbc:mysql://localhost:3306/mitchell";
		
		try {
			
			Connection con = DriverManager.getConnection(myURL, "root", "");
			
			String sql = "INSERT INTO `lossinfo`(CauseOfLoss, ReportedDate, LossDescription) VALUES(?, ?, ?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			
			String CauseOfLoss = lossInfo.getCauseOfLoss().toString();
			XMLGregorianCalendar date = lossInfo.getReportedDate();
			java.sql.Date date1 = new java.sql.Date(0);
			String LossDescription = lossInfo.getLossDescription();
			
			preparedStatement.setString(1, CauseOfLoss);
			preparedStatement.setDate(2, date1);
			preparedStatement.setString(3, LossDescription);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Update Successful");
		} 
		
		catch (SQLException e) {
			System.out.println("Connection cannot be established");
			e.printStackTrace();
		}
	}

}
