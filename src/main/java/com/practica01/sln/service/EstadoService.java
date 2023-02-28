package com.practica01.sln.service;
import com.practica01.sln.domain.Estado;
import java.util.List;

public interface EstadoService {
    public List<Estado> getEstados();
    public Estado getEstados(Estado estado);
    public void save (Estado estado);
    public void delete(Estado estado);
    
}
