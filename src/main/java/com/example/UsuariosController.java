package com.example;

import com.opensymphony.xwork2.ActionSupport;

public class UsuariosController extends ActionSupport {

	private static final long serialVersionUID = -1167543752277181740L;

	@Override
	public String execute() throws Exception {
		System.out.println(":: Entro a usuarios ::");
		
		return SUCCESS;
	}
}
