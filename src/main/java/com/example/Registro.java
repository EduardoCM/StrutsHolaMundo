package com.example;

import com.opensymphony.xwork2.ActionSupport;

public class Registro extends ActionSupport {

	private static final long serialVersionUID = -770205829521331940L;

	private String nombrs;
	private String apellido;
	private String correo;

	@Override
	public String execute() throws Exception {
		System.out.println("Entro a registro de Usuarios");
		
		System.out.println("Nombre:   " + nombrs);
		System.out.println("Apellido: " + apellido);
		System.out.println("Correo:   " + correo);

		return SUCCESS;
	}
	
	
	public String registroUsuarios(){		
		System.out.println("::::: Registrando Usuario ::::");
		
		System.out.println("Nombre:   " + nombrs);
		System.out.println("Apellido: " + apellido);
		System.out.println("Correo:   " + correo);
		
		return SUCCESS;
	}
	
	

	public String getNombrs() {
		return nombrs;
	}

	public void setNombrs(String nombrs) {
		this.nombrs = nombrs;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
