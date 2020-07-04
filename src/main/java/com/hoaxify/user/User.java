package com.hoaxify.user;

import lombok.Data;


//Utilizamos lombok que nos genera todos los getters y setters
@Data
public  class User {

	
		private String username;
		
		private String DisplayName;
		
		private String password;
			
}
