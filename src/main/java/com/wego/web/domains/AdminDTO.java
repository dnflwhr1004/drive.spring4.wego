package com.wego.web.domains;
import java.io.Serializable;
import lombok.Data;
@Data
public class AdminDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String eid,pwd,eName,job,mgr,hireDate,sal,comm,deptNo;
}
