package ai.svl.services.oauth2server.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TC_USER database table.
 * 
 */
@Entity
@Table(name="TC_USER")
@NamedQuery(name="TcUser.findAll", query="SELECT t FROM TcUser t")
public class TcUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name="USER_ID")
	private Long userId;

	@Column(name="ADDR_DTL")
	private String addrDtl;

	@Column(name="ADDR1_CD")
	private String addr1Cd;

	@Column(name="ADDR2_CD")
	private String addr2Cd;

	@Column(name="CELL_NO")
	private String cellNo;

	private String email;

	@Column(name="FAX_NO")
	private String faxNo;

	@Column(name="MOD_DTM")
	private String modDtm;

	@Column(name="MOD_ID")
	private String modId;

	@Column(name="PW_MOD_DTM")
	private String pwModDtm;

	@Column(name="REG_DTM")
	private String regDtm;

	@Column(name="REG_ID")
	private String regId;

	@Column(name="TEL_NO")
	private String telNo;

	@Column(name="USE_BGN_DT")
	private String useBgnDt;

	@Column(name="USE_END_DT")
	private String useEndDt;

	@Column(name="USE_YN")
	private String useYn;

	@Column(name="USER_NM")
	private String userNm;

	@Column(name="USER_NM_ENG")
	private String userNmEng;

	@Column(name="USER_PW")
	private String userPw;

	//bi-directional many-to-one association to TcOrg
	@ManyToOne
	@JoinColumn(name="ORG_CD")
	private TcOrg tcOrg;


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "tc_user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<TcRole> roles;
	//bi-directional many-to-one association to TcUserRole
	/*@OneToMany(mappedBy="tcUser", fetch = FetchType.EAGER)
	private List<TcUserRole> tcUserRoles;*/

	public TcUser() {
	}

	public TcUser(String username, String password,TcOrg tcOrg) {
		this.userNm = username;
		this.userPw = password;
		this.tcOrg=tcOrg;
	}



	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getCellNo() {
		return this.cellNo;
	}

	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPwModDtm() {
		return this.pwModDtm;
	}

	public void setPwModDtm(String pwModDtm) {
		this.pwModDtm = pwModDtm;
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

	public String getUseBgnDt() {
		return this.useBgnDt;
	}

	public void setUseBgnDt(String useBgnDt) {
		this.useBgnDt = useBgnDt;
	}

	public String getUseEndDt() {
		return this.useEndDt;
	}

	public void setUseEndDt(String useEndDt) {
		this.useEndDt = useEndDt;
	}

	public String getUseYn() {
		return this.useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getUserNm() {
		return this.userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getUserNmEng() {
		return this.userNmEng;
	}

	public void setUserNmEng(String userNmEng) {
		this.userNmEng = userNmEng;
	}

	public String getUserPw() {
		return this.userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public TcOrg getTcOrg() {
		return this.tcOrg;
	}

	public void setTcOrg(TcOrg tcOrg) {
		this.tcOrg = tcOrg;
	}

	public List<TcRole> getRoles() {
		return roles;
	}

	public void setRoles(List<TcRole> roles) {
		this.roles = roles;
	}

	/*public List<TcUserRole> getTcUserRoles() {
		return tcUserRoles;
	}

	public void setTcUserRoles(List<TcUserRole> tcUserRoles) {
		this.tcUserRoles = tcUserRoles;
	}*/
}