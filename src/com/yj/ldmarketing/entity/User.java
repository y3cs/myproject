package com.yj.ldmarketing.entity;

import java.sql.Timestamp;

public class User {

	// the Field
	private String userid;
	private String username;
	private String userpwd;
	private String permissiongroup;
	private String email;
	private Timestamp createtime;
	private short state;
	private String nickname;
	private String tel;
	private String address;
	private String headimg;
	private Integer age;
	private short sex;
	private String logoimg;
	private String logourl;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String userpwd, String permissiongroup,
			String email, Timestamp createtime, short state, String nickname,
			String tel, String address, String headimg, Integer age, short sex,
			String logoimg, String logourl) {
		super();
		this.username = username;
		this.userpwd = userpwd;
		this.permissiongroup = permissiongroup;
		this.email = email;
		this.createtime = createtime;
		this.state = state;
		this.nickname = nickname;
		this.tel = tel;
		this.address = address;
		this.headimg = headimg;
		this.age = age;
		this.sex = sex;
		this.logoimg = logoimg;
		this.logourl = logourl;

	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getPermissiongroup() {
		return permissiongroup;
	}

	public void setPermissiongroup(String permissiongroup) {
		this.permissiongroup = permissiongroup;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public short getState() {
		return state;
	}

	public void setState(short state) {
		this.state = state;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHeadimg() {
		return headimg;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public short getSex() {
		return sex;
	}

	public void setSex(short sex) {
		this.sex = sex;
	}

	public String getLogoimg() {
		return logoimg;
	}

	public void setLogoimg(String logoimg) {
		this.logoimg = logoimg;
	}

	public String getLogourl() {
		return logourl;
	}

	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}

}
