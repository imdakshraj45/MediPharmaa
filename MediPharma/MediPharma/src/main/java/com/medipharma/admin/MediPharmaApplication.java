package com.medipharma.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.medipharma.admin.listener.EventListener;
import com.medipharma.admin.listener.SessionListener;

@ServletComponentScan
@SpringBootApplication
public class MediPharmaApplication {

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication();
		//sa.getRunListeners(new SessionListener());
		sa.run(MediPharmaApplication.class, args);

	}

}
