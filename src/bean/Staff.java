package bean;

import java.io.Serializable;

public class Staff extends User implements Serializable {
	/**
	 * 教員ID:String
	 */
	private String staff_id;

	/**
	 * パスワード:String
	 */
	private String password;

	/**
	 * 教員名:String
	 */
	private String staff_name;

	/**
	 * 学校ID:String
	 */
	private String school_cd;

	/**
	 * 権限:String
	 */
	private String auth;


	/**
	 * ゲッター、セッター
	 */

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public String getSchool_cd() {
		return school_cd;
	}

	public void setSchool_cd(String school_cd) {
		this.school_cd = school_cd;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

}