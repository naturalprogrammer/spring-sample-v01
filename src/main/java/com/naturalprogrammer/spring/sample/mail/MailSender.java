package com.naturalprogrammer.spring.sample.mail;

public interface MailSender {

	public abstract void send(String to, String subject, String body);

}