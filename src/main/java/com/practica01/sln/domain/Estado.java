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

@Data //Crea los get y set automáticos
@Entity
@Table(name="estado") //Se relaciona con la tabla de BD estados


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
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se ponen en las entidades
    private Long id_pais;
    private String nombre;
    private String capital;
    private int continente;
    private int poblacion;
    private int zona_horaria;
    
    public Estado() {
    }

    //Constructor sobrecargado
    public Estado(Long id_pais, String nombre, String capital, int continente, int poblacion, int zona_horaria) {
        this.id_pais = id_pais;
        this.nombre = nombre;
        this.capital = capital;
        this.continente = continente;
        this.poblacion = poblacion;
        this.zona_horaria = zona_horaria;
    }
    
    public String getIdEstado() {
        return id_pais.toString();
    }
    
    public void setIdEstado(Long IdEstado) {
        this.id_pais = id_pais;
    }
    
}



