package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author S
 * @see 员工
 */
public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;

	private String eid;
	private String ename;
	private String idcard;
	private String phone;
	private String address;
	private String did;
	private Integer status;
	private String photo;
	private Date hiredate;
	private Date leavedate;
	private Integer upuid;
	private Date uptime;

	public Integer getUpuid() {
		return upuid;
	}

	public void setUpuid(Integer upuid) {
		this.upuid = upuid;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Date getLeavedate() {
		return leavedate;
	}

	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", idcard="
				+ idcard + ", phone=" + phone + ", address=" + address
				+ ", did=" + did + ", status=" + status + ", photo=" + photo
				+ ", hiredate=" + hiredate + ", leavedate=" + leavedate
				+ ", upuid=" + upuid + ", uptime=" + uptime + "]";
	}

}
