/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.sln.domain;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")

public class Estado {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se ponen en las entidades
    private Long idPais;
    String  nombre_pais;
    String capital;
    int id_continente;
    int poblacion;
    String zona_horaria;
    
    public Estado() {
    }
    
    //Constructor cargado con los datos de la tabla estado
    public Estado(Long idPais, String nombre_pais, String capital, int id_continente, int poblacion, String zona_horaria) {
        this.idPais = idPais;
        this.nombre_pais = nombre_pais;
        this.capital = capital;
        this.id_continente = id_continente;
        this.poblacion = poblacion;
        this.zona_horaria = zona_horaria;
    }  
}



