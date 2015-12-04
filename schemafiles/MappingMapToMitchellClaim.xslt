<?xml version="1.0" encoding="UTF-8"?>
<!--
This file was generated by Altova MapForce 2016sp1

YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.

Refer to the Altova MapForce Documentation for further details.
http://www.altova.com/mapforce
-->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns0="http://www.mitchell.com/examples/claim" xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="ns0 xs">
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/">
		<xsl:variable name="var1_initial" select="."/>
		<MitchellClaim xmlns="http://www.mitchell.com/examples/claim">
			<xsl:attribute name="xsi:schemaLocation" namespace="http://www.w3.org/2001/XMLSchema-instance">http://www.mitchell.com/examples/claim file:///C:/Users/Udaya%20Duvvuri/Desktop/Mitchell%20International%20Skype%20Interview%20Availability/MitchellClaim.xsd</xsl:attribute>
			<xsl:for-each select="ns0:MitchellClaim">
				<xsl:variable name="var2_current" select="."/>
				<ClaimNumber>
					<xsl:value-of select="ns0:ClaimNumber"/>
				</ClaimNumber>
			</xsl:for-each>
			<xsl:for-each select="ns0:MitchellClaim">
				<xsl:variable name="var3_current" select="."/>
				<ClaimantFirstName>
					<xsl:value-of select="ns0:ClaimantFirstName"/>
				</ClaimantFirstName>
			</xsl:for-each>
			<xsl:for-each select="ns0:MitchellClaim">
				<xsl:variable name="var4_current" select="."/>
				<ClaimantLastName>
					<xsl:value-of select="ns0:ClaimantLastName"/>
				</ClaimantLastName>
			</xsl:for-each>
			<xsl:for-each select="ns0:MitchellClaim">
				<xsl:variable name="var5_current" select="."/>
				<Status>
					<xsl:value-of select="ns0:Status"/>
				</Status>
			</xsl:for-each>
			<xsl:for-each select="ns0:MitchellClaim">
				<xsl:variable name="var6_current" select="."/>
				<LossDate>
					<xsl:value-of select="ns0:LossDate"/>
				</LossDate>
			</xsl:for-each>
			<LossInfo>
				<xsl:for-each select="ns0:MitchellClaim">
					<xsl:variable name="var7_current" select="."/>
					<CauseOfLoss>
						<xsl:value-of select="ns0:LossInfo/ns0:CauseOfLoss"/>
					</CauseOfLoss>
				</xsl:for-each>
				<xsl:for-each select="ns0:MitchellClaim">
					<xsl:variable name="var8_current" select="."/>
					<ReportedDate>
						<xsl:value-of select="ns0:LossInfo/ns0:ReportedDate"/>
					</ReportedDate>
				</xsl:for-each>
				<xsl:for-each select="ns0:MitchellClaim">
					<xsl:variable name="var9_current" select="."/>
					<LossDescription>
						<xsl:value-of select="ns0:LossInfo/ns0:LossDescription"/>
					</LossDescription>
				</xsl:for-each>
			</LossInfo>
			<xsl:for-each select="ns0:MitchellClaim">
				<xsl:variable name="var10_current" select="."/>
				<AssignedAdjusterID>
					<xsl:value-of select="floor(ns0:AssignedAdjusterID)"/>
				</AssignedAdjusterID>
			</xsl:for-each>
			<Vehicles>
				<VehicleDetails>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var11_current" select="."/>
						<ModelYear>
							<xsl:value-of select="floor(ns0:Vehicles/ns0:VehicleDetails/ns0:ModelYear)"/>
						</ModelYear>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var12_current" select="."/>
						<MakeDescription>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:MakeDescription"/>
						</MakeDescription>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var13_current" select="."/>
						<ModelDescription>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:ModelDescription"/>
						</ModelDescription>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var14_current" select="."/>
						<EngineDescription>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:EngineDescription"/>
						</EngineDescription>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var15_current" select="."/>
						<ExteriorColor>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:ExteriorColor"/>
						</ExteriorColor>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var16_current" select="."/>
						<Vin>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:Vin"/>
						</Vin>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var17_current" select="."/>
						<LicPlate>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:LicPlate"/>
						</LicPlate>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var18_current" select="."/>
						<LicPlateState>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:LicPlateState"/>
						</LicPlateState>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var19_current" select="."/>
						<LicPlateExpDate>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:LicPlateExpDate"/>
						</LicPlateExpDate>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var20_current" select="."/>
						<DamageDescription>
							<xsl:value-of select="ns0:Vehicles/ns0:VehicleDetails/ns0:DamageDescription"/>
						</DamageDescription>
					</xsl:for-each>
					<xsl:for-each select="ns0:MitchellClaim">
						<xsl:variable name="var21_current" select="."/>
						<Mileage>
							<xsl:value-of select="floor(ns0:Vehicles/ns0:VehicleDetails/ns0:Mileage)"/>
						</Mileage>
					</xsl:for-each>
				</VehicleDetails>
			</Vehicles>
		</MitchellClaim>
	</xsl:template>
</xsl:stylesheet>
