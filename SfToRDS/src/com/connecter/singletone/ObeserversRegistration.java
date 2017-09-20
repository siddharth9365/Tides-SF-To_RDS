package com.connecter.singletone;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.connecter.dao.CallDao;
import com.connecter.triggers.CallChangeNumbers;
import com.connecter.triggers.CallObserver2;
import com.connecter.workflows.UpdateClientLocalTime;

/**
 * Servlet implementation class ObeserversRegistration
 */

@Component
public class ObeserversRegistration {
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
		CallDao callDao = new CallDao();
		CallChangeNumbers callChangeNumbers = new CallChangeNumbers();
		CallObserver2 callObserver2 = new CallObserver2();
		UpdateClientLocalTime updateClientLocalTime = new UpdateClientLocalTime(callDao);
		System.out.println("post construct");
		callDao.registerObserver(callChangeNumbers);
		callDao.registerObserver(callObserver2);
		callDao.registerObserver(updateClientLocalTime);
	}
}
