DROP TABLE `mitchell`.`MitchellClaim`;

DROP TABLE `mitchell`.`LossInfo`;

DROP TABLE `mitchell`.`VehicleDetails`;

CREATE TABLE `mitchell`.`MitchellClaim` ( `ClaimNumber` char (255)  NOT NULL , `ClaimantFirstName` char (255)  , `ClaimantLastName` char (255)  , `Status` char (255)  , CHECK ( ( `Status` IN ( 'OPEN', 'CLOSED' )  )  )  , `LossDate` datetime  , `AssignedAdjusterID` bigint  , CHECK ( ( `AssignedAdjusterID` >= -9223372036854775808 )  AND ( `AssignedAdjusterID` <= 9223372036854775807 )  )  ) ;

CREATE TABLE `mitchell`.`LossInfo` ( `CauseOfLoss` char (255)  , CHECK ( ( `CauseOfLoss` IN ( 'Collision', 'Explosion', 'Fire', 'Hail', 'Mechanical Breakdown', 'Other' )  )  )  , `ReportedDate` datetime  , `LossDescription` char (255)  ) ;

CREATE TABLE `mitchell`.`VehicleDetails` ( `ModelYear` int  NOT NULL , CHECK ( ( `ModelYear` >= -2147483648 )  AND ( `ModelYear` <= 2147483647 )  )  , `MakeDescription` char (255)  , `ModelDescription` char (255)  , `EngineDescription` char (255)  , `ExteriorColor` char (255)  , `Vin` char (255)  , `LicPlate` char (255)  , `LicPlateState` char (255)  , `LicPlateExpDate` varchar (255)  , `DamageDescription` char (255)  , `Mileage` int  , CHECK ( ( `Mileage` >= -2147483648 )  AND ( `Mileage` <= 2147483647 )  )  ) ;

