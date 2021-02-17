package com.german.spring.clientes.back.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.german.spring.clientes.back.model.Cliente;

@Mapper
public interface ClienteMapper {

	@Select("SELECT * FROM pruebas.cliente")
	public List<Cliente> findAll();

	@Insert("INSERT INTO pruebas.cliente(nombre, apellido, email, createat) VALUES(#{nombre},#{apellido},#{email},#{createAt})")
	public void insertCliente(Cliente cliente);
	
	@Select("SELECT * FROM pruebas.cliente WHERE id=#{id}")
	public Cliente findClienteById(Long id);
	
	@Delete("DELETE FROM pruebas.cliente WHERE id=#{id}")
	public void deleteClienteById(Long id);
	
	@Update("UPDATE pruebas.cliente SET nombre=#{nombre} , apellido=#{apellido}, email =#{email} where id=#{id}")
	public void updateCliente(Cliente cliente);
}
