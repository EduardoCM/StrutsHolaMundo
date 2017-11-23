package com.example;

import com.opensymphony.xwork2.ActionSupport;

public class ClientesController extends ActionSupport {
	
	private static final long serialVersionUID = 8466090477798168246L;


	@Override
	public String execute() throws Exception {
		System.out.println(":::: Entro a cliente controller Version 2");
		return SUCCESS;
	}

}
