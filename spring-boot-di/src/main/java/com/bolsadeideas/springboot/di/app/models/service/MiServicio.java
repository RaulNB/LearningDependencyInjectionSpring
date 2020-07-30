package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("miServicio")
//@Primary
public class MiServicio implements IMiServicio{

	@Override  
	public String operacion() {
		
		return "ejecutando algún proceso...";
	}
	
}
