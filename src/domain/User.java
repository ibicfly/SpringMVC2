package domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class User{
	private int uId;
	private String uName;
	private int credits;
	private String password;
	private Date last_visit;
	private String last_ip;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLast_visit() {
		return last_visit;
	}
	public void setLast_visit(Date last_visit) {
		this.last_visit = last_visit;
	}
	public String getLast_ip() {
		return last_ip;
	}
	public void setLast_ip(String last_ip) {
		this.last_ip = last_ip;
	}
}
