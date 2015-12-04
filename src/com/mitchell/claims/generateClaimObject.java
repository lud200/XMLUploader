package com.mitchell.claims;

import java.io.*;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.mitchell.examples.claim.*;

public class generateClaimObject {
	public static MitchellClaimType generateObject(){
		
		MitchellClaimType claimType = null;
		
		try{
			
			JAXBContext jaxbContext = JAXBContext.newInstance(MitchellClaimType.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			FileInputStream XMLfile = new FileInputStream("C:/Users/Udaya Duvvuri/Eclipse J2EE/Mitchell International/schemafiles/create-claim.xml");
			claimType = (MitchellClaimType) jaxbUnmarshaller.unmarshal(XMLfile);
			
		}
		
		catch(Exception e){
			System.out.println("Object cannot be created!");
			e.printStackTrace();
		}
		
		return claimType;
	}
}
