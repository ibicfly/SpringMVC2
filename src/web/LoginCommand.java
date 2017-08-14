package web;

import javax.validation.constraints.NotNull;

public class LoginCommand {
	@NotNull
	private String uName;
	private String password;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
