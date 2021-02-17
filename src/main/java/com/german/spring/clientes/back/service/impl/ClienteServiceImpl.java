package com.german.spring.clientes.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.german.spring.clientes.back.mapper.ClienteMapper;
import com.german.spring.clientes.back.model.Cliente;
import com.german.spring.clientes.back.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteMapper clienteMapper;

	@Override
	public List<Cliente> findAll() {

		return clienteMapper.findAll();
	}

	@Override
	public Cliente findClienteById(Long id) {

		return clienteMapper.findClienteById(id);
	}

	@Override
	public void insertCliente(Cliente cliente) {

		clienteMapper.insertCliente(cliente);
	}

	@Override
	public void delete(Long id) {

		clienteMapper.deleteClienteById(id);

	}

}
