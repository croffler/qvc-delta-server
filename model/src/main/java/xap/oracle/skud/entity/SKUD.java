package xap.oracle.skud.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import xap.model.IDomainEntity;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceRouting;

/**
 * Entity
 * 
 * @author conape3
 * 
 */

@SpaceClass
@NamedNativeQueries({ @NamedNativeQuery(name = "findSKUDByRowIds", query = "select * from SKUD e where e.rowid IN (:rowIds)", resultClass = SKUD.class) })
@NamedQueries({
		@NamedQuery(name = "findSKUDByRowId", query = "from SKUD s where rowid = :rowId"),
		@NamedQuery(name = "findSKUDById", query = "from SKUD s where sknNbr = :id") })
@Entity
@Table(name = "SKUD")
@SequenceGenerator(name = "GENERATOR", sequenceName = "SKUD_SEQUENCE")
public class SKUD implements IDomainEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERATOR")
	@Column(name = "ID" ,nullable = false, precision = 38, scale = 0)
	private Long id;

	@Transient
	private String rowid;

	private String sknNbr;

	private String colorNbr;
	private String sizeNbr;
	private String colorSizeDsc;
	private String skuStatCd;
	private Float imprtCostAmt;
	private String wlEligCd;
	private Integer wlLmtQty;
	private Long upcNbr;
	private Float shpWt;
	private Integer adjmtQty;
	private Timestamp adjmtExpirTms;
	private String shpEligCd;
	private Integer sizeSeqNbr;
	private Integer colorSeqNbr;
	private Float retlAtsPct;
	private String fstExpWlovrdInd;
	private String outOfStockInd;
	private Integer stdColorCd;
	private Integer stdSizeCd;
	private Timestamp colorSizeUpdTms;
	private Integer omLegPosNbr;
	private Integer pcLegPosNbr;
	private String pkCertCd;
	private Integer certLegPosNbr;
	private String pkSpeclInstrDsc;
	private Integer siLegPosNbr;
	private String pkStandUpTagCd;
	private Integer supLegPosNbr;
	private String pkPouchCd;
	private Integer pouchLegPosNbr;
	private String pkOvrpkMailrCd;
	private Integer ovrpkLegPosNbr;
	private String commdtyGrpCd;
	private String famGrpCd;
	private Float itemLenDim;
	private Float itemHeghtDim;
	private Float itemWidDim;
	private Float itemWt;
	private String srtblInd;
	private Long skuArtclId;
	private String boInd;
	private Long caseHeghtDim;
	private Long caseLenDim;
	private Long caseSktQty;
	private Float caseWt;
	private Long caseWidDim;
	private Long casePerPalltQty;
	private Float giftWrpPkgWt;
	private Long palltHeghtDim;
	private Long palltLenDim;
	private Long palltStkQty;
	private Long palltWidDim;
	private Long unitPerCaseQty;
	private String vendrSkuSknCd;
	private String skuCreateUserId;
	private Timestamp skuCreateTms;
	private String seasonCd;
	private Float skuCostAmt;
	private Long primDcId;
	private String wtUomCd;
	private String outrMailrCd;
	private String presCaseCd;
	private String invRunOutInd;
	private Date wlLmtCalcDt;
	private Long eanNbr;
	private Integer ovrszLvlNbr;
	private String dimUomCd;
	private Integer prntStdColorCd;
	private Integer prntStdSizeCd;

	/**
	 * @return the sknNbr
	 */
	@SpaceRouting
	public String getSknNbr() {
		return sknNbr;
	}

	/**
	 * @param sknNbr
	 *            the sknNbr to set
	 */
	public void setSknNbr(String sknNbr) {
		this.sknNbr = sknNbr;
	}

	/**
	 * @return the colorNbr
	 */
	public String getColorNbr() {
		return colorNbr;
	}

	/**
	 * @param colorNbr
	 *            the colorNbr to set
	 */
	public void setColorNbr(String colorNbr) {
		this.colorNbr = colorNbr;
	}

	/**
	 * @return the sizeNbr
	 */
	public String getSizeNbr() {
		return sizeNbr;
	}

	/**
	 * @param sizeNbr
	 *            the sizeNbr to set
	 */
	public void setSizeNbr(String sizeNbr) {
		this.sizeNbr = sizeNbr;
	}

	/**
	 * @return the colorSizeDsc
	 */
	public String getColorSizeDsc() {
		return colorSizeDsc;
	}

	/**
	 * @param colorSizeDsc
	 *            the colorSizeDsc to set
	 */
	public void setColorSizeDsc(String colorSizeDsc) {
		this.colorSizeDsc = colorSizeDsc;
	}

	/**
	 * @return the skuStatCd
	 */
	public String getSkuStatCd() {
		return skuStatCd;
	}

	/**
	 * @param skuStatCd
	 *            the skuStatCd to set
	 */
	public void setSkuStatCd(String skuStatCd) {
		this.skuStatCd = skuStatCd;
	}

	/**
	 * @return the wlEligCd
	 */
	public String getWlEligCd() {
		return wlEligCd;
	}

	/**
	 * @param wlEligCd
	 *            the wlEligCd to set
	 */
	public void setWlEligCd(String wlEligCd) {
		this.wlEligCd = wlEligCd;
	}

	/**
	 * @return the wlLmtQty
	 */
	public Integer getWlLmtQty() {
		return wlLmtQty;
	}

	/**
	 * @param wlLmtQty
	 *            the wlLmtQty to set
	 */
	public void setWlLmtQty(Integer wlLmtQty) {
		this.wlLmtQty = wlLmtQty;
	}

	/**
	 * @return the upcNbr
	 */
	public Long getUpcNbr() {
		return upcNbr;
	}

	/**
	 * @param upcNbr
	 *            the upcNbr to set
	 */
	public void setUpcNbr(Long upcNbr) {
		this.upcNbr = upcNbr;
	}

	/**
	 * @return the shpWt
	 */
	public Float getShpWt() {
		return shpWt;
	}

	/**
	 * @param shpWt
	 *            the shpWt to set
	 */
	public void setShpWt(Float shpWt) {
		this.shpWt = shpWt;
	}

	/**
	 * @return the adjmtQty
	 */
	public Integer getAdjmtQty() {
		return adjmtQty;
	}

	/**
	 * @param adjmtQty
	 *            the adjmtQty to set
	 */
	public void setAdjmtQty(Integer adjmtQty) {
		this.adjmtQty = adjmtQty;
	}

	/**
	 * @return the adjmtExpirTms
	 */
	public Timestamp getAdjmtExpirTms() {
		return adjmtExpirTms;
	}

	/**
	 * @param adjmtExpirTms
	 *            the adjmtExpirTms to set
	 */
	public void setAdjmtExpirTms(Timestamp adjmtExpirTms) {
		this.adjmtExpirTms = adjmtExpirTms;
	}

	/**
	 * @return the shpEligCd
	 */
	public String getShpEligCd() {
		return shpEligCd;
	}

	/**
	 * @param shpEligCd
	 *            the shpEligCd to set
	 */
	public void setShpEligCd(String shpEligCd) {
		this.shpEligCd = shpEligCd;
	}

	/**
	 * @return the sizeSeqNbr
	 */
	public Integer getSizeSeqNbr() {
		return sizeSeqNbr;
	}

	/**
	 * @param sizeSeqNbr
	 *            the sizeSeqNbr to set
	 */
	public void setSizeSeqNbr(Integer sizeSeqNbr) {
		this.sizeSeqNbr = sizeSeqNbr;
	}

	/**
	 * @return the colorSeqNbr
	 */
	public Integer getColorSeqNbr() {
		return colorSeqNbr;
	}

	/**
	 * @param colorSeqNbr
	 *            the colorSeqNbr to set
	 */
	public void setColorSeqNbr(Integer colorSeqNbr) {
		this.colorSeqNbr = colorSeqNbr;
	}

	/**
	 * @return the retlAtsPct
	 */
	public Float getRetlAtsPct() {
		return retlAtsPct;
	}

	/**
	 * @param retlAtsPct
	 *            the retlAtsPct to set
	 */
	public void setRetlAtsPct(Float retlAtsPct) {
		this.retlAtsPct = retlAtsPct;
	}

	/**
	 * @return the fstExpWlovrdInd
	 */
	public String getFstExpWlovrdInd() {
		return fstExpWlovrdInd;
	}

	/**
	 * @param fstExpWlovrdInd
	 *            the fstExpWlovrdInd to set
	 */
	public void setFstExpWlovrdInd(String fstExpWlovrdInd) {
		this.fstExpWlovrdInd = fstExpWlovrdInd;
	}

	/**
	 * @return the outOfStockInd
	 */
	public String getOutOfStockInd() {
		return outOfStockInd;
	}

	/**
	 * @param outOfStockInd
	 *            the outOfStockInd to set
	 */
	public void setOutOfStockInd(String outOfStockInd) {
		this.outOfStockInd = outOfStockInd;
	}

	/**
	 * @return the stdColorCd
	 */
	public Integer getStdColorCd() {
		return stdColorCd;
	}

	/**
	 * @param stdColorCd
	 *            the stdColorCd to set
	 */
	public void setStdColorCd(Integer stdColorCd) {
		this.stdColorCd = stdColorCd;
	}

	/**
	 * @return the stdSizeCd
	 */
	public Integer getStdSizeCd() {
		return stdSizeCd;
	}

	/**
	 * @param stdSizeCd
	 *            the stdSizeCd to set
	 */
	public void setStdSizeCd(Integer stdSizeCd) {
		this.stdSizeCd = stdSizeCd;
	}

	/**
	 * @return the colorSizeUpdTms
	 */
	public Timestamp getColorSizeUpdTms() {
		return colorSizeUpdTms;
	}

	/**
	 * @param colorSizeUpdTms
	 *            the colorSizeUpdTms to set
	 */
	public void setColorSizeUpdTms(Timestamp colorSizeUpdTms) {
		this.colorSizeUpdTms = colorSizeUpdTms;
	}

	/**
	 * @return the omLegPosNbr
	 */
	public Integer getOmLegPosNbr() {
		return omLegPosNbr;
	}

	/**
	 * @param omLegPosNbr
	 *            the omLegPosNbr to set
	 */
	public void setOmLegPosNbr(Integer omLegPosNbr) {
		this.omLegPosNbr = omLegPosNbr;
	}

	/**
	 * @return the pcLegPosNbr
	 */
	public Integer getPcLegPosNbr() {
		return pcLegPosNbr;
	}

	/**
	 * @param pcLegPosNbr
	 *            the pcLegPosNbr to set
	 */
	public void setPcLegPosNbr(Integer pcLegPosNbr) {
		this.pcLegPosNbr = pcLegPosNbr;
	}

	/**
	 * @return the pkCertCd
	 */
	public String getPkCertCd() {
		return pkCertCd;
	}

	/**
	 * @param pkCertCd
	 *            the pkCertCd to set
	 */
	public void setPkCertCd(String pkCertCd) {
		this.pkCertCd = pkCertCd;
	}

	/**
	 * @return the certLegPosNbr
	 */
	public Integer getCertLegPosNbr() {
		return certLegPosNbr;
	}

	/**
	 * @param certLegPosNbr
	 *            the certLegPosNbr to set
	 */
	public void setCertLegPosNbr(Integer certLegPosNbr) {
		this.certLegPosNbr = certLegPosNbr;
	}

	/**
	 * @return the pkSpeclInstrDsc
	 */
	public String getPkSpeclInstrDsc() {
		return pkSpeclInstrDsc;
	}

	/**
	 * @param pkSpeclInstrDsc
	 *            the pkSpeclInstrDsc to set
	 */
	public void setPkSpeclInstrDsc(String pkSpeclInstrDsc) {
		this.pkSpeclInstrDsc = pkSpeclInstrDsc;
	}

	/**
	 * @return the siLegPosNbr
	 */
	public Integer getSiLegPosNbr() {
		return siLegPosNbr;
	}

	/**
	 * @param siLegPosNbr
	 *            the siLegPosNbr to set
	 */
	public void setSiLegPosNbr(Integer siLegPosNbr) {
		this.siLegPosNbr = siLegPosNbr;
	}

	/**
	 * @return the pkStandUpTagCd
	 */
	public String getPkStandUpTagCd() {
		return pkStandUpTagCd;
	}

	/**
	 * @param pkStandUpTagCd
	 *            the pkStandUpTagCd to set
	 */
	public void setPkStandUpTagCd(String pkStandUpTagCd) {
		this.pkStandUpTagCd = pkStandUpTagCd;
	}

	/**
	 * @return the supLegPosNbr
	 */
	public Integer getSupLegPosNbr() {
		return supLegPosNbr;
	}

	/**
	 * @param supLegPosNbr
	 *            the supLegPosNbr to set
	 */
	public void setSupLegPosNbr(Integer supLegPosNbr) {
		this.supLegPosNbr = supLegPosNbr;
	}

	/**
	 * @return the pkPouchCd
	 */
	public String getPkPouchCd() {
		return pkPouchCd;
	}

	/**
	 * @param pkPouchCd
	 *            the pkPouchCd to set
	 */
	public void setPkPouchCd(String pkPouchCd) {
		this.pkPouchCd = pkPouchCd;
	}

	/**
	 * @return the pouchLegPosNbr
	 */
	public Integer getPouchLegPosNbr() {
		return pouchLegPosNbr;
	}

	/**
	 * @param pouchLegPosNbr
	 *            the pouchLegPosNbr to set
	 */
	public void setPouchLegPosNbr(Integer pouchLegPosNbr) {
		this.pouchLegPosNbr = pouchLegPosNbr;
	}

	/**
	 * @return the pkOvrpkMailrCd
	 */
	public String getPkOvrpkMailrCd() {
		return pkOvrpkMailrCd;
	}

	/**
	 * @param pkOvrpkMailrCd
	 *            the pkOvrpkMailrCd to set
	 */
	public void setPkOvrpkMailrCd(String pkOvrpkMailrCd) {
		this.pkOvrpkMailrCd = pkOvrpkMailrCd;
	}

	/**
	 * @return the ovrpkLegPosNbr
	 */
	public Integer getOvrpkLegPosNbr() {
		return ovrpkLegPosNbr;
	}

	/**
	 * @param ovrpkLegPosNbr
	 *            the ovrpkLegPosNbr to set
	 */
	public void setOvrpkLegPosNbr(Integer ovrpkLegPosNbr) {
		this.ovrpkLegPosNbr = ovrpkLegPosNbr;
	}

	/**
	 * @return the commdtyGrpCd
	 */
	public String getCommdtyGrpCd() {
		return commdtyGrpCd;
	}

	/**
	 * @param commdtyGrpCd
	 *            the commdtyGrpCd to set
	 */
	public void setCommdtyGrpCd(String commdtyGrpCd) {
		this.commdtyGrpCd = commdtyGrpCd;
	}

	/**
	 * @return the famGrpCd
	 */
	public String getFamGrpCd() {
		return famGrpCd;
	}

	/**
	 * @param famGrpCd
	 *            the famGrpCd to set
	 */
	public void setFamGrpCd(String famGrpCd) {
		this.famGrpCd = famGrpCd;
	}

	/**
	 * @return the itemLenDim
	 */
	public Float getItemLenDim() {
		return itemLenDim;
	}

	/**
	 * @param itemLenDim
	 *            the itemLenDim to set
	 */
	public void setItemLenDim(Float itemLenDim) {
		this.itemLenDim = itemLenDim;
	}

	/**
	 * @return the itemHeghtDim
	 */
	public Float getItemHeghtDim() {
		return itemHeghtDim;
	}

	/**
	 * @param itemHeghtDim
	 *            the itemHeghtDim to set
	 */
	public void setItemHeghtDim(Float itemHeghtDim) {
		this.itemHeghtDim = itemHeghtDim;
	}

	/**
	 * @return the itemWidDim
	 */
	public Float getItemWidDim() {
		return itemWidDim;
	}

	/**
	 * @param itemWidDim
	 *            the itemWidDim to set
	 */
	public void setItemWidDim(Float itemWidDim) {
		this.itemWidDim = itemWidDim;
	}

	/**
	 * @return the itemWt
	 */
	public Float getItemWt() {
		return itemWt;
	}

	/**
	 * @param itemWt
	 *            the itemWt to set
	 */
	public void setItemWt(Float itemWt) {
		this.itemWt = itemWt;
	}

	/**
	 * @return the srtblInd
	 */
	public String getSrtblInd() {
		return srtblInd;
	}

	/**
	 * @param srtblInd
	 *            the srtblInd to set
	 */
	public void setSrtblInd(String srtblInd) {
		this.srtblInd = srtblInd;
	}

	/**
	 * @return the skuArtclId
	 */
	public Long getSkuArtclId() {
		return skuArtclId;
	}

	/**
	 * @param skuArtclId
	 *            the skuArtclId to set
	 */
	public void setSkuArtclId(Long skuArtclId) {
		this.skuArtclId = skuArtclId;
	}

	/**
	 * @return the boInd
	 */
	public String getBoInd() {
		return boInd;
	}

	/**
	 * @param boInd
	 *            the boInd to set
	 */
	public void setBoInd(String boInd) {
		this.boInd = boInd;
	}

	/**
	 * @return the caseHeghtDim
	 */
	public Long getCaseHeghtDim() {
		return caseHeghtDim;
	}

	/**
	 * @param caseHeghtDim
	 *            the caseHeghtDim to set
	 */
	public void setCaseHeghtDim(Long caseHeghtDim) {
		this.caseHeghtDim = caseHeghtDim;
	}

	/**
	 * @return the caseLenDim
	 */
	public Long getCaseLenDim() {
		return caseLenDim;
	}

	/**
	 * @param caseLenDim
	 *            the caseLenDim to set
	 */
	public void setCaseLenDim(Long caseLenDim) {
		this.caseLenDim = caseLenDim;
	}

	/**
	 * @return the caseSktQty
	 */
	public Long getCaseSktQty() {
		return caseSktQty;
	}

	/**
	 * @param caseSktQty
	 *            the caseSktQty to set
	 */
	public void setCaseSktQty(Long caseSktQty) {
		this.caseSktQty = caseSktQty;
	}

	/**
	 * @return the caseWt
	 */
	public Float getCaseWt() {
		return caseWt;
	}

	/**
	 * @param caseWt
	 *            the caseWt to set
	 */
	public void setCaseWt(Float caseWt) {
		this.caseWt = caseWt;
	}

	/**
	 * @return the caseWidDim
	 */
	public Long getCaseWidDim() {
		return caseWidDim;
	}

	/**
	 * @param caseWidDim
	 *            the caseWidDim to set
	 */
	public void setCaseWidDim(Long caseWidDim) {
		this.caseWidDim = caseWidDim;
	}

	/**
	 * @return the casePerPalltQty
	 */
	public Long getCasePerPalltQty() {
		return casePerPalltQty;
	}

	/**
	 * @param casePerPalltQty
	 *            the casePerPalltQty to set
	 */
	public void setCasePerPalltQty(Long casePerPalltQty) {
		this.casePerPalltQty = casePerPalltQty;
	}

	/**
	 * @return the giftWrpPkgWt
	 */
	public Float getGiftWrpPkgWt() {
		return giftWrpPkgWt;
	}

	/**
	 * @param giftWrpPkgWt
	 *            the giftWrpPkgWt to set
	 */
	public void setGiftWrpPkgWt(Float giftWrpPkgWt) {
		this.giftWrpPkgWt = giftWrpPkgWt;
	}

	/**
	 * @return the palltHeghtDim
	 */
	public Long getPalltHeghtDim() {
		return palltHeghtDim;
	}

	/**
	 * @param palltHeghtDim
	 *            the palltHeghtDim to set
	 */
	public void setPalltHeghtDim(Long palltHeghtDim) {
		this.palltHeghtDim = palltHeghtDim;
	}

	/**
	 * @return the palltLenDim
	 */
	public Long getPalltLenDim() {
		return palltLenDim;
	}

	/**
	 * @param palltLenDim
	 *            the palltLenDim to set
	 */
	public void setPalltLenDim(Long palltLenDim) {
		this.palltLenDim = palltLenDim;
	}

	/**
	 * @return the palltStkQty
	 */
	public Long getPalltStkQty() {
		return palltStkQty;
	}

	/**
	 * @param palltStkQty
	 *            the palltStkQty to set
	 */
	public void setPalltStkQty(Long palltStkQty) {
		this.palltStkQty = palltStkQty;
	}

	/**
	 * @return the palltWidDim
	 */
	public Long getPalltWidDim() {
		return palltWidDim;
	}

	/**
	 * @param palltWidDim
	 *            the palltWidDim to set
	 */
	public void setPalltWidDim(Long palltWidDim) {
		this.palltWidDim = palltWidDim;
	}

	/**
	 * @return the unitPerCaseQty
	 */
	public Long getUnitPerCaseQty() {
		return unitPerCaseQty;
	}

	/**
	 * @param unitPerCaseQty
	 *            the unitPerCaseQty to set
	 */
	public void setUnitPerCaseQty(Long unitPerCaseQty) {
		this.unitPerCaseQty = unitPerCaseQty;
	}

	/**
	 * @return the vendrSkuSknCd
	 */
	public String getVendrSkuSknCd() {
		return vendrSkuSknCd;
	}

	/**
	 * @param vendrSkuSknCd
	 *            the vendrSkuSknCd to set
	 */
	public void setVendrSkuSknCd(String vendrSkuSknCd) {
		this.vendrSkuSknCd = vendrSkuSknCd;
	}

	/**
	 * @return the skuCreateUserId
	 */
	public String getSkuCreateUserId() {
		return skuCreateUserId;
	}

	/**
	 * @param skuCreateUserId
	 *            the skuCreateUserId to set
	 */
	public void setSkuCreateUserId(String skuCreateUserId) {
		this.skuCreateUserId = skuCreateUserId;
	}

	/**
	 * @return the skuCreateTms
	 */
	public Timestamp getSkuCreateTms() {
		return skuCreateTms;
	}

	/**
	 * @param skuCreateTms
	 *            the skuCreateTms to set
	 */
	public void setSkuCreateTms(Timestamp skuCreateTms) {
		this.skuCreateTms = skuCreateTms;
	}

	/**
	 * @return the seasonCd
	 */
	public String getSeasonCd() {
		return seasonCd;
	}

	/**
	 * @param seasonCd
	 *            the seasonCd to set
	 */
	public void setSeasonCd(String seasonCd) {
		this.seasonCd = seasonCd;
	}

	/**
	 * @return the skuCostAmt
	 */
	public Float getSkuCostAmt() {
		return skuCostAmt;
	}

	/**
	 * @param skuCostAmt
	 *            the skuCostAmt to set
	 */
	public void setSkuCostAmt(Float skuCostAmt) {
		this.skuCostAmt = skuCostAmt;
	}

	/**
	 * @return the primDcId
	 */
	public Long getPrimDcId() {
		return primDcId;
	}

	/**
	 * @param primDcId
	 *            the primDcId to set
	 */
	public void setPrimDcId(Long primDcId) {
		this.primDcId = primDcId;
	}

	/**
	 * @return the wtUomCd
	 */
	public String getWtUomCd() {
		return wtUomCd;
	}

	/**
	 * @param wtUomCd
	 *            the wtUomCd to set
	 */
	public void setWtUomCd(String wtUomCd) {
		this.wtUomCd = wtUomCd;
	}

	/**
	 * @return the outrMailrCd
	 */
	public String getOutrMailrCd() {
		return outrMailrCd;
	}

	/**
	 * @param outrMailrCd
	 *            the outrMailrCd to set
	 */
	public void setOutrMailrCd(String outrMailrCd) {
		this.outrMailrCd = outrMailrCd;
	}

	/**
	 * @return the presCaseCd
	 */
	public String getPresCaseCd() {
		return presCaseCd;
	}

	/**
	 * @param presCaseCd
	 *            the presCaseCd to set
	 */
	public void setPresCaseCd(String presCaseCd) {
		this.presCaseCd = presCaseCd;
	}

	/**
	 * @return the invRunOutInd
	 */
	public String getInvRunOutInd() {
		return invRunOutInd;
	}

	/**
	 * @param invRunOutInd
	 *            the invRunOutInd to set
	 */
	public void setInvRunOutInd(String invRunOutInd) {
		this.invRunOutInd = invRunOutInd;
	}

	/**
	 * @return the wlLmtCalcDt
	 */
	public Date getWlLmtCalcDt() {
		return wlLmtCalcDt;
	}

	/**
	 * @param wlLmtCalcDt
	 *            the wlLmtCalcDt to set
	 */
	public void setWlLmtCalcDt(Date wlLmtCalcDt) {
		this.wlLmtCalcDt = wlLmtCalcDt;
	}

	/**
	 * @return the eanNbr
	 */
	public Long getEanNbr() {
		return eanNbr;
	}

	/**
	 * @param eanNbr
	 *            the eanNbr to set
	 */
	public void setEanNbr(Long eanNbr) {
		this.eanNbr = eanNbr;
	}

	/**
	 * @return the ovrszLvlNbr
	 */
	public Integer getOvrszLvlNbr() {
		return ovrszLvlNbr;
	}

	/**
	 * @param ovrszLvlNbr
	 *            the ovrszLvlNbr to set
	 */
	public void setOvrszLvlNbr(Integer ovrszLvlNbr) {
		this.ovrszLvlNbr = ovrszLvlNbr;
	}

	/**
	 * @return the dimUomCd
	 */
	public String getDimUomCd() {
		return dimUomCd;
	}

	/**
	 * @param dimUomCd
	 *            the dimUomCd to set
	 */
	public void setDimUomCd(String dimUomCd) {
		this.dimUomCd = dimUomCd;
	}

	/**
	 * @return the prntStdColorCd
	 */
	public Integer getPrntStdColorCd() {
		return prntStdColorCd;
	}

	/**
	 * @param prntStdColorCd
	 *            the prntStdColorCd to set
	 */
	public void setPrntStdColorCd(Integer prntStdColorCd) {
		this.prntStdColorCd = prntStdColorCd;
	}

	/**
	 * @return the prntStdSizeCd
	 */
	public Integer getPrntStdSizeCd() {
		return prntStdSizeCd;
	}

	/**
	 * @param prntStdSizeCd
	 *            the prntStdSizeCd to set
	 */
	public void setPrntStdSizeCd(Integer prntStdSizeCd) {
		this.prntStdSizeCd = prntStdSizeCd;
	}

	public Float getImprtCostAmt() {
		return imprtCostAmt;
	}

	public void setImprtCostAmt(Float imprtCostAmt) {
		this.imprtCostAmt = imprtCostAmt;
	}

	@Override
	@SpaceId
	public Long getId() {
		return id;
	}

	public String getRowid() {
		return rowid;
	}

	public void setRowid(String rowid) {
		this.rowid = rowid;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
