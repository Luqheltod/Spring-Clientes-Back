package com.german.spring.clientes.back.service;

import java.util.List;
import com.german.spring.clientes.back.model.Cliente;

public interface ClienteService {

	
	public List<Cliente> findAll();
	
	public Cliente findClienteById(Long id);
	
	public void insertCliente(Cliente cliente);
	
	public void delete (Long id);
}
