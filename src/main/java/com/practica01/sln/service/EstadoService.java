/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.sln.service;

import com.practica01.sln.domain.Estado;
import java.util.List;

/**
 *
 * @author HP PROBOOK
 */
public interface EstadoService {
    
    public List<Estado> getEstados();
    
    public Estado getEstado(Estado estado);
    
    public void save (Estado estado);
    
    public void delete(Estado estado);
}
