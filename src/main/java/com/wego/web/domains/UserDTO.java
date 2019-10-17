package com.wego.web.domains;
import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
 @Component
public class UserDTO {

	

	private String uid, pwd, uname, birth, gender, tel, pettype;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}  
	
}
