package com.wego.web.domains;
import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data @Component
	public class HostDTO implements Serializable {

		private static final long serialVersionUID = 1L;

		private String host_id, host_pw , host_name , Representative , Company_type
					, Company_add;
		
		private int Company_tel, License_no;
}
