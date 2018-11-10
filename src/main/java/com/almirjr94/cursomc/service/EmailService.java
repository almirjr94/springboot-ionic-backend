package com.almirjr94.cursomc.service;

import org.springframework.mail.SimpleMailMessage;

import com.almirjr94.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
	
}
