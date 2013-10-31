package xap.oracle.test;

import xap.oracle.skud.entity.SKUD;

public class Utility {

	static SKUD createSKUD(String[] line) throws Exception {
		SKUD d = new SKUD();

		d.setSknNbr(line[0]);

		d.setColorNbr(line[1]);
		d.setSizeNbr(line[2]);
		d.setColorSizeDsc(line[3]);
		d.setSkuStatCd(line[4]);
		d.setImprtCostAmt(LoaderUtility.toFloat(line[5]));
		d.setWlEligCd(line[6]);
		d.setWlLmtQty(LoaderUtility.toInteger(line[7]));
		d.setUpcNbr(LoaderUtility.toLong(line[8]));
		d.setShpWt(LoaderUtility.toFloat(line[9]));
		d.setAdjmtQty(LoaderUtility.toInteger(line[10]));
//		d.setAdjmtExpirTms(LoaderUtility.toDate(line[11]));
		d.setShpEligCd(line[12]);
		d.setSizeSeqNbr(LoaderUtility.toInteger(line[13]));
		d.setColorSeqNbr(LoaderUtility.toInteger(line[14]));
		d.setRetlAtsPct(LoaderUtility.toFloat(line[15]));
		d.setFstExpWlovrdInd(line[16]);
		d.setOutOfStockInd(line[17]);
		d.setStdColorCd(LoaderUtility.toInteger(line[18]));
		d.setStdSizeCd(LoaderUtility.toInteger(line[19]));
		// d.setColorSizeUpdTms(line[20]);
		d.setOmLegPosNbr(LoaderUtility.toInteger(line[21]));
		d.setPcLegPosNbr(LoaderUtility.toInteger(line[22]));
		d.setPkCertCd(line[23]);
		d.setCertLegPosNbr(LoaderUtility.toInteger(line[24]));
		d.setPkSpeclInstrDsc(line[25]);
		d.setSiLegPosNbr(LoaderUtility.toInteger(line[26]));
		d.setPkStandUpTagCd(line[27]);
		d.setSupLegPosNbr(LoaderUtility.toInteger(line[28]));
		d.setPkPouchCd(line[29]);
		d.setPouchLegPosNbr(LoaderUtility.toInteger(line[30]));
		d.setPkOvrpkMailrCd(line[31]);
		d.setOvrpkLegPosNbr(LoaderUtility.toInteger(line[32]));
		d.setCommdtyGrpCd(line[33]);
		d.setFamGrpCd(line[34]);
		d.setItemLenDim(LoaderUtility.toFloat(line[35]));
		d.setItemHeghtDim(LoaderUtility.toFloat(line[36]));
		d.setItemWidDim(LoaderUtility.toFloat(line[37]));
		d.setItemWt(LoaderUtility.toFloat(line[38]));
		d.setSrtblInd(line[39]);
		d.setSkuArtclId(LoaderUtility.toLong(line[40]));
		d.setBoInd(line[41]);
		d.setCaseHeghtDim(LoaderUtility.toLong(line[42]));
		d.setCaseLenDim(LoaderUtility.toLong(line[43]));
		d.setCaseSktQty(LoaderUtility.toLong(line[44]));
		d.setCaseWt(LoaderUtility.toFloat(line[45]));
		d.setCaseWidDim(LoaderUtility.toLong(line[46]));
		d.setCasePerPalltQty(LoaderUtility.toLong(line[47]));
		d.setGiftWrpPkgWt(LoaderUtility.toFloat(line[48]));
		d.setPalltHeghtDim(LoaderUtility.toLong(line[49]));
		d.setPalltLenDim(LoaderUtility.toLong(line[50]));
		d.setPalltStkQty(LoaderUtility.toLong(line[51]));
		d.setPalltWidDim(LoaderUtility.toLong(line[52]));
		d.setUnitPerCaseQty(LoaderUtility.toLong(line[53]));
		d.setVendrSkuSknCd(line[54]);
		d.setSkuCreateUserId(line[55]);
		// d.setSkuCreateTms(line[56]);
		d.setSeasonCd(line[57]);
		d.setSkuCostAmt(LoaderUtility.toFloat(line[58]));
		d.setPrimDcId(LoaderUtility.toLong(line[59]));
		d.setWtUomCd(line[60]);
		d.setOutrMailrCd(line[61]);
		d.setPresCaseCd(line[62]);
		d.setInvRunOutInd(line[63]);
		// d.setWlLmtCalcDt(line[64]);
		d.setEanNbr(LoaderUtility.toLong(line[65]));
		d.setOvrszLvlNbr(LoaderUtility.toInteger(line[66]));
		d.setDimUomCd(line[67]);
		d.setPrntStdColorCd(LoaderUtility.toInteger(line[68]));
		d.setPrntStdSizeCd(LoaderUtility.toInteger(line[69]));

		return d;
	}

}
