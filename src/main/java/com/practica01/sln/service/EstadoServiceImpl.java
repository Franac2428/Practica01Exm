/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.practica01.sln.service;
import com.practica01.sln.dao.EstadoDao;
import com.practica01.sln.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author HP PROBOOK
 */

@Service
public class EstadoServicelmpl implements EstadoService{
    
     @Autowired
    EstadoDao clienteDao;
    
    @Transactional(readOnly = true) //Para que en la BD esto sea de solo lectura
    public List<Estado> getClientes() {
        //Cast as list
       return (List<Estado>)EstadoDao.findAll();
    }

    @Transactional(readOnly = true)
    public Estado getCliente(Estado Estado) {
        return clienteDao.findById(Estado.getIdPais()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }
    
}
}
