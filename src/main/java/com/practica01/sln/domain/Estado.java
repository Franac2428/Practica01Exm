/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.sln.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //Crea los get y set automáticos
@Entity
@Table(name="estados") //Se relaciona con la tabla de BD estados

public class Estado {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se ponen en las entidades
    private Int id_pais; //Hibernate lo transforma en id_pais
    String nombre_pais;
    String capital;
    Int id_continente;
    Int poblacion;
    String zona_horaria;
    
    public Estado() {
    }

    //Constructor sobrecargado
    public Estado(String nombre_pais, String capital, Int id_continente, Int poblacion, String zona_horaria) {
        this.nombrePais = nombre_pais;
        this.capital = capital;
        this.continente = id_continente;
        this.poblacion = poblacion;
        this.zona = zona_horaria;
    }
    
}
