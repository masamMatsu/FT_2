package bean;
import java.util.Date;

public class Student implements java.io.Serializable {

	private int student_no;
	private String student_name;
	private int ent_year;
	private String class_no;
	private boolean attend_flg;
	private String school_id;
	private Date out_date;
	private boolean abs_flg;
	private String abs_reason;
	private Date caution20;
	private Date caution40;
	private Date caution60;
	private Date caution80;
	private Date caution100;

	public int getStudent_no() {
		return student_no;
	}
	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getEnt_year() {
		return ent_year;
	}
	public void setEnt_year(int ent_year) {
		this.ent_year = ent_year;
	}
	public String getClass_no() {
		return class_no;
	}
	public void setClass_no(String class_no) {
		this.class_no = class_no;
	}
	public boolean isAttend_flg() {
		return attend_flg;
	}
	public void setAttend_flg(boolean attend_flg) {
		this.attend_flg = attend_flg;
	}
	public String getSchool_id() {
		return school_id;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
	public Date getOut_date() {
		return out_date;
	}
	public void setOut_date(Date out_date) {
		this.out_date = out_date;
	}
	public boolean isAbs_flg() {
		return abs_flg;
	}
	public void setAbs_flg(boolean abs_flg) {
		this.abs_flg = abs_flg;
	}
	public String getAbs_reason() {
		return abs_reason;
	}
	public void setAbs_reason(String abs_reason) {
		this.abs_reason = abs_reason;
	}
	public Date getCaution20() {
		return caution20;
	}
	public void setCaution20(Date caution20) {
		this.caution20 = caution20;
	}
	public Date getCaution40() {
		return caution40;
	}
	public void setCaution40(Date caution40) {
		this.caution40 = caution40;
	}
	public Date getCaution60() {
		return caution60;
	}
	public void setCaution60(Date caution60) {
		this.caution60 = caution60;
	}
	public Date getCaution80() {
		return caution80;
	}
	public void setCaution80(Date caution80) {
		this.caution80 = caution80;
	}
	public Date getCaution100() {
		return caution100;
	}
	public void setCaution100(Date caution100) {
		this.caution100 = caution100;
	}



}
