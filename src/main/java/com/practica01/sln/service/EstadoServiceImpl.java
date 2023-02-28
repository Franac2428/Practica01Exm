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
public class EstadoServiceImpl implements EstadoService {
    
    @Autowired
    EstadoDao estadoDao;
    
    @Override
    @Transactional(readOnly = true) //Para que en la BD esto sea de solo lectura
    public List<Estado> getEstados() {
        //Cast as list
       return (List<Estado>)estadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.deleteById(estado.getIdEstado());
    }
    
}
