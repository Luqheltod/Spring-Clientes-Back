package com.german.spring.clientes.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.german.spring.clientes.back.mapper.ClienteMapper;
import com.german.spring.clientes.back.model.Cliente;
import com.german.spring.clientes.back.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteMapper clienteMapper;
	
	@Override
	public List<Cliente> findAll() {
		
		return clienteMapper.findAll();
	}

}
