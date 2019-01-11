package ai.svl.services.oauth2server.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TC_ORG database table.
 * 
 */
@Entity
@Table(name="TC_ORG")
@NamedQuery(name="TcOrg.findAll", query="SELECT t FROM TcOrg t")
public class TcOrg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORG_CD")
	private Long orgCd;

	@Column(name="ADDR_DTL")
	private String addrDtl;

	@Column(name="ADDR1_CD")
	private String addr1Cd;

	@Column(name="ADDR2_CD")
	private String addr2Cd;

	@Column(name="APLY_DT")
	private String aplyDt;

	@Column(name="CLSE_DT")
	private String clseDt;

	@Column(name="FAX_NO")
	private String faxNo;

	@Column(name="MOD_DTM")
	private String modDtm;

	@Column(name="MOD_ID")
	private String modId;

	@Column(name="ORG_DIV_CD")
	private String orgDivCd;

	@Column(name="ORG_HDCF_NM")
	private String orgHdcfNm;

	@Column(name="ORG_LV_CD")
	private String orgLvCd;

	@Column(name="ORG_NM")
	private String orgNm;

	@Column(name="ORG_NM_ENG")
	private String orgNmEng;

	@Column(name="ORG_ORD")
	private BigDecimal orgOrd;

	@Column(name="REG_DTM")
	private String regDtm;

	@Column(name="REG_ID")
	private String regId;

	@Column(name="TEL_NO")
	private String telNo;

	@Column(name="UPPR_ORG_CD")
	private String upprOrgCd;

	@Column(name="USE_YN")
	private String useYn;

	//bi-directional many-to-one association to TcUser
	@OneToMany(mappedBy="tcOrg", cascade = CascadeType.ALL)
	private List<TcUser> tcUsers;

	public TcOrg() {
	}

	public Long getOrgCd() {
		return this.orgCd;
	}

	public void setOrgCd(Long orgCd) {
		this.orgCd = orgCd;
	}

	public String getAddrDtl() {
		return this.addrDtl;
	}

	public void setAddrDtl(String addrDtl) {
		this.addrDtl = addrDtl;
	}

	public String getAddr1Cd() {
		return this.addr1Cd;
	}

	public void setAddr1Cd(String addr1Cd) {
		this.addr1Cd = addr1Cd;
	}

	public String getAddr2Cd() {
		return this.addr2Cd;
	}

	public void setAddr2Cd(String addr2Cd) {
		this.addr2Cd = addr2Cd;
	}

	public String getAplyDt() {
		return this.aplyDt;
	}

	public void setAplyDt(String aplyDt) {
		this.aplyDt = aplyDt;
	}

	public String getClseDt() {
		return this.clseDt;
	}

	public void setClseDt(String clseDt) {
		this.clseDt = clseDt;
	}

	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getModDtm() {
		return this.modDtm;
	}

	public void setModDtm(String modDtm) {
		this.modDtm = modDtm;
	}

	public String getModId() {
		return this.modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	public String getOrgDivCd() {
		return this.orgDivCd;
	}

	public void setOrgDivCd(String orgDivCd) {
		this.orgDivCd = orgDivCd;
	}

	public String getOrgHdcfNm() {
		return this.orgHdcfNm;
	}

	public void setOrgHdcfNm(String orgHdcfNm) {
		this.orgHdcfNm = orgHdcfNm;
	}

	public String getOrgLvCd() {
		return this.orgLvCd;
	}

	public void setOrgLvCd(String orgLvCd) {
		this.orgLvCd = orgLvCd;
	}

	public String getOrgNm() {
		return this.orgNm;
	}

	public void setOrgNm(String orgNm) {
		this.orgNm = orgNm;
	}

	public String getOrgNmEng() {
		return this.orgNmEng;
	}

	public void setOrgNmEng(String orgNmEng) {
		this.orgNmEng = orgNmEng;
	}

	public BigDecimal getOrgOrd() {
		return this.orgOrd;
	}

	public void setOrgOrd(BigDecimal orgOrd) {
		this.orgOrd = orgOrd;
	}

	public String getRegDtm() {
		return this.regDtm;
	}

	public void setRegDtm(String regDtm) {
		this.regDtm = regDtm;
	}

	public String getRegId() {
		return this.regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getUpprOrgCd() {
		return this.upprOrgCd;
	}

	public void setUpprOrgCd(String upprOrgCd) {
		this.upprOrgCd = upprOrgCd;
	}

	public String getUseYn() {
		return this.useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public List<TcUser> getTcUsers() {
		return this.tcUsers;
	}

	public void setTcUsers(List<TcUser> tcUsers) {
		this.tcUsers = tcUsers;
	}

	public TcUser addTcUser(TcUser tcUser) {
		getTcUsers().add(tcUser);
		tcUser.setTcOrg(this);

		return tcUser;
	}

	public TcUser removeTcUser(TcUser tcUser) {
		getTcUsers().remove(tcUser);
		tcUser.setTcOrg(null);

		return tcUser;
	}

}