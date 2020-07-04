package com.hoaxify.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


//Utilizamos lombok que nos genera todos los getters y setters
@Data
@Entity
public  class User {

		
		@Id
		@GeneratedValue
		private long id;
		
		private String username;
		
		private String DisplayName;
		
		private String password;
			
}
