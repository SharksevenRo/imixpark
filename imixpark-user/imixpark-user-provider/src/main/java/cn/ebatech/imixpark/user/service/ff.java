/*
 CREATE TABLE `Ba_shop`( 
`ID` VARCHAR(20) ,
`SPJM` VARCHAR(20) ,
`SPNAME` VARCHAR(60) ,
`SPENAME` VARCHAR(60) ,
`STATUS` CHAR(1)  ,
`ISVALID` CHAR(1)  ,
`STR` VARCHAR(20) ,
`FLOOR` VARCHAR(20) ,
`REGIONAL` VARCHAR(20) ,
`LOCATION` VARCHAR(4) ,
`SHAPE` VARCHAR(4) ,
`LENGTH` VARCHAR(4) ,
`EASY` CHAR(1) ,
`SPXZ` VARCHAR(10) ,
`ZQJH` VARCHAR(10) ,
`HYGH` VARCHAR(10) ,
`YTGH` VARCHAR(10) ,
`ZLGH` VARCHAR(10) ,
`KIND` VARCHAR(2) ,
`JZAREA` float(22) ,
`SYAREA` float(22) ,
`ZJAREA` float(22) ,
`AREALX` CHAR(1)  ,
`RENTDW` CHAR(1)  ,
`RENTTS` float(22) ,
`EXPRENT` float(22) ,
`EXPSJ` float(22) ,
`CURRENCIES` VARCHAR(2) ,
`POWERK` float(22) ,
`POWERSL` float(22) ,
`CABLESSIZE1` VARCHAR(10) ,
`CABLESPCS1` float(22) ,
`CABLESSIZE2` VARCHAR(10) ,
`CABLESPCS2` float(22) ,
`CABLESSIZE3` VARCHAR(10) ,
`CABLESPCS3` float(22) ,
`WATERFLG` VARCHAR(10) ,
`WATERMEMO` VARCHAR(30) ,
`WATERSL` float(22) ,
`WATERSIZE` VARCHAR(10) ,
`FCUTYPE` VARCHAR(10) ,
`FCUSL` float(22) ,
`FCURT` float(22) ,
`AIRTYPE` VARCHAR(10) ,
`AIRSL` float(22) ,
`AIRRT` float(22) ,
`CENTERTYPE` VARCHAR(10) ,
`CENTERSL` float(22) ,
`CENTERRT` float(22) ,
`SUPPLYWH` VARCHAR(20) ,
`RETURNWH` VARCHAR(20) ,
`KITFLG` VARCHAR(10) ,
`KITWH` VARCHAR(10) ,
`KITMEMO` VARCHAR(30) ,
`FIRESL1` float(22) ,
`FIRESL2` float(22) ,
`FIRESL3` float(22) ,
`SMOKESL` float(22) ,
`TRAPFLG` VARCHAR(10) ,
`LINESL1` float(22) ,
`LINESL2` float(22) ,
`POSSL` float(22) ,
`IS_XSSY` CHAR(1) ,
`HTH` VARCHAR(20) ,
`MEMO` VARCHAR(80) ,
`OPRID` VARCHAR(15) ,
`ADTID` VARCHAR(15),
`POSTID` CHAR(8),
`LAST_MODIFIED` DATE(7),
`SSLD`  VARCHAR(20),
`LAST_BILLID` VARCHAR(6),
`LAST_BILLNO` VARCHAR(20),
`LAST_OPERID` VARCHAR(20),
`OPRDATE` DATE(7),
`ADTDATE` DATE(7),
`SOURCE` CHAR(1),
`ISMARK` CHAR(1)
)ENGINE=MyISAM DEFAULT CHARSET=utf8; 
DROP TABLE IF EXISTS `Ba_shop`;  
CREATE TABLE `Ba_shop`( 
`ID` VARCHAR(20),
`SPJM` VARCHAR(20),
`SPNAME` VARCHAR(60),
`SPENAME` VARCHAR(60),
`STATUS` CHAR(1),
`ISVALID` CHAR(1),
)


 CREATE TABLE `Ba_shop`( 
`ID` VARCHAR(20),
`SPJM` VARCHAR(20),
`SPNAME` VARCHAR(60),
`SPENAME` VARCHAR(60),
`STATUS` CHAR(1),
`ISVALID` CHAR(1),
`STR` VARCHAR(20),
`FLOOR` VARCHAR(20),
`REGIONAL` VARCHAR(20),
`LOCATION` VARCHAR(4),
`SHAPE` VARCHAR(4),
`LENGTH` VARCHAR(4),
`EASY` CHAR(1),
`SPXZ` VARCHAR(10),
`ZQJH` VARCHAR(10),
`HYGH` VARCHAR(10),
`YTGH` VARCHAR(10),
`ZLGH` VARCHAR(10),
`KIND` VARCHAR(2),
`JZAREA` float(22),
`SYAREA` float(22),
`ZJAREA` float(22),
`AREALX` CHAR(1),
`RENTDW` CHAR(1),
`RENTTS` float(22),
`EXPRENT` float(22),
`EXPSJ` float(22),
`CURRENCIES` VARCHAR(2),
`POWERK` float(22),
`POWERSL` float(22),
`CABLESSIZE1` VARCHAR(10),
`CABLESPCS1` float(22),
`CABLESSIZE2` VARCHAR(10),
`CABLESPCS2` float(22),
`CABLESSIZE3` VARCHAR(10),
`CABLESPCS3` float(22),
`WATERFLG` VARCHAR(10),
`WATERMEMO` VARCHAR(30),
`WATERSL` float(22),
`WATERSIZE` VARCHAR(10),
`FCUTYPE` VARCHAR(10),
`FCUSL` float(22),
`FCURT` float(22),
`AIRTYPE` VARCHAR(10),
`AIRSL` float(22),
`AIRRT` float(22),
`CENTERTYPE` VARCHAR(10),
`CENTERSL` float(22),
`CENTERRT` float(22),
`SUPPLYWH` VARCHAR(20),
`RETURNWH` VARCHAR(20),
`KITFLG` VARCHAR(10),
`KITWH` VARCHAR(10),
`KITMEMO` VARCHAR(30),
`FIRESL1` float(22),
`FIRESL2` float(22),
`FIRESL3` float(22),
`SMOKESL` float(22),
`TRAPFLG` VARCHAR(10),
`LINESL1` float(22),
`LINESL2` float(22),
`POSSL` float(22),
`IS_XSSY` CHAR(1),
`HTH` VARCHAR(20),
`MEMO` VARCHAR(80),
`OPRID` VARCHAR(15),
`ADTID` VARCHAR(15),
`POSTID` CHAR,
`LAST_MODIFIED`,
`SSLD` VARCHAR(20),
`LAST_BILLID` VARCHAR(6),
`LAST_BILLNO` VARCHAR(20),
`LAST_OPERID` VARCHAR(20),
`OPRDATE` DATE,
`ADTDATE` DATE,
`SOURCE` CHAR(1),
`ISMARK` CHAR(1)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `weixin_user` (
  `WEIXIN_USER_ID` int(11) NOT NULL DEFAULT `0` COMMENT `ID`,
  `REGISTER_FLAG` char(1) DEFAULT NULL COMMENT `是否注册 0 否 1 是`,
  `WEIXIN_USER_OPENID` int(11) DEFAULT NULL COMMENT `OPENID`,
  `WEIXIN_USER_ALIAS` varchar(20) DEFAULT NULL COMMENT `昵称`,
  `INTEREST_FLAG` char(1) DEFAULT NULL COMMENT `是否关注`,
  `WEIXIN_USER_INTEREST_DATE` date DEFAULT NULL COMMENT `关注时间`,
  `WEIXIN_USER_REGISTER_DATE` date DEFAULT NULL COMMENT `注册时间`,
  `WEIXIN_USER_SEX` char(1) DEFAULT NULL COMMENT `性别`,
  `WEIXIN_USER_NATIVE_PLACE` varchar(200) DEFAULT NULL COMMENT `籍贯`,
  `WEIXIN_USER_NO` varchar(20) DEFAULT NULL COMMENT `微信号`,
  `USER_ID` int(11) NOT NULL COMMENT `会员ID`,
  `WEIXIN_USER_LOGO` varchar(100) DEFAULT NULL COMMENT `头像`,
  PRIMARY KEY (`WEIXIN_USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*
*
*/