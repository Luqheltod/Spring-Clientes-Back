package com.german.spring.clientes.back.repository;

public class pruebaDto {
	private long id;
    private String name;
    
    public pruebaDto() {
    	
    }
    
	public pruebaDto(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
