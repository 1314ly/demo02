package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.aaa.util.DateConverter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author S
 * @see 员工
 */

public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer uid;
	private String uname;
	private String pwd;
	private Integer empid;
	private Integer rid;
	private String rname;
	private Integer upuid;
	// 后台接收前台字符串时转换为Date类型
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	// 前台显示后台返回的日期类型
	// @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonSerialize(using = DateConverter.class)
	private Date uptime;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Integer getUpuid() {
		return upuid;
	}

	public void setUpuid(Integer upuid) {
		this.upuid = upuid;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", pwd=" + pwd
				+ ", empid=" + empid + ", rid=" + rid + ", rname=" + rname
				+ ", upuid=" + upuid + ", uptime=" + uptime + "]";
	}

}
