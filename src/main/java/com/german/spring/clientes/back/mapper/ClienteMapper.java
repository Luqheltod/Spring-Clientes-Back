package com.german.spring.clientes.back.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.german.spring.clientes.back.model.Cliente;

@Mapper
public interface ClienteMapper {

	@Select("SELECT * FROM pruebas.tablapruebas")
	public List<Cliente> findAll();
}
