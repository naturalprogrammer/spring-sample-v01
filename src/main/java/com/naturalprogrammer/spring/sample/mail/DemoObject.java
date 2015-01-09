package com.naturalprogrammer.spring.sample.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

public class DemoObject {

	private static final Log log = LogFactory.getLog(DemoObject.class);

	
	public DemoObject() {
		log.info("Creating on object");
	}

}
