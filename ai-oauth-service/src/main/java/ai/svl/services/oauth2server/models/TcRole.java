package ai.svl.services.oauth2server.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TC_ROLE database table.
 * 
 */
@Entity
@Table(name="TC_ROLE")
@NamedQuery(name="TcRole.findAll", query="SELECT t FROM TcRole t")
public class TcRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ROLE_ID")
	private Long roleId;

	@Column(name="MOD_DTM")
	private String modDtm;

	@Column(name="MOD_ID")
	private String modId;

	@Column(name="REG_DTM")
	private String regDtm;

	@Column(name="REG_ID")
	private String regId;

	@Column(name="ROLE_DESC")
	private String roleDesc;

	@Column(name="ROLE_NM")
	private String roleNm;

	@Column(name="ROLE_NM_ENG")
	private String roleNmEng;

	@Column(name="USE_YN")
	private String useYn;

	//bi-directional many-to-one association to TcUserRole
/*	@OneToMany(mappedBy="tcRole")
	private List<TcUserRole> tcUserRoles;*/



	public TcRole() {
	}

	public TcRole(String name) {
		this.roleNmEng = name;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
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

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleNm() {
		return this.roleNm;
	}

	public void setRoleNm(String roleNm) {
		this.roleNm = roleNm;
	}

	public String getRoleNmEng() {
		return this.roleNmEng;
	}

	public void setRoleNmEng(String roleNmEng) {
		this.roleNmEng = roleNmEng;
	}

	public String getUseYn() {
		return this.useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

/*	public List<TcUserRole> getTcUserRoles() {
		return tcUserRoles;
	}

	public void setTcUserRoles(List<TcUserRole> tcUserRoles) {
		this.tcUserRoles = tcUserRoles;
	}*/
}