package com.naturalprogrammer.spring.sample.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
public class MailConfig {
	
	@Bean
	//@Profile("dev")
	public MailSender mockMailSender() {
		MockMailSender mailSender = new MockMailSender();
		mailSender.setDemoObject(demoObject());
		return mailSender;
	}

	@Bean
	//@Profile("!dev")
	@Primary
	public MailSender smtpMailSender(DemoObject demoObject) {
		SmtpMailSender mailSender = new SmtpMailSender();
		mailSender.setDemoObject(demoObject);
		return mailSender;
	}
	
	@Bean
	public DemoObject demoObject() {
		return new DemoObject();
	}

}
