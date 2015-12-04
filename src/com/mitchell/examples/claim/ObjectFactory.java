//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.02 at 05:07:17 AM EST 
//


package com.mitchell.examples.claim;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mitchell.examples.claim package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MitchellClaim_QNAME = new QName("http://www.mitchell.com/examples/claim", "MitchellClaim");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mitchell.examples.claim
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MitchellClaimType }
     * 
     */
    public MitchellClaimType createMitchellClaimType() {
        return new MitchellClaimType();
    }

    /**
     * Create an instance of {@link LossInfoType }
     * 
     */
    public LossInfoType createLossInfoType() {
        return new LossInfoType();
    }

    /**
     * Create an instance of {@link VehicleInfoType }
     * 
     */
    public VehicleInfoType createVehicleInfoType() {
        return new VehicleInfoType();
    }

    /**
     * Create an instance of {@link VehicleListType }
     * 
     */
    public VehicleListType createVehicleListType() {
        return new VehicleListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MitchellClaimType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mitchell.com/examples/claim", name = "MitchellClaim")
    public JAXBElement<MitchellClaimType> createMitchellClaim(MitchellClaimType value) {
        return new JAXBElement<MitchellClaimType>(_MitchellClaim_QNAME, MitchellClaimType.class, null, value);
    }

}
