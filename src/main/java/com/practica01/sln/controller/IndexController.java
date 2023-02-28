/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.practica01.sln.controller;

import com.practica01.sln.dao.EstadoDao;
import com.practica01.sln.domain.Estado;
import com.practica01.sln.service.EstadoService;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    //Esto es sobre la interface pero al llevar la notacion @Service trae los metodos de quien los implemente
   @Autowired
   EstadoService estadoService;
    
   @GetMapping("/") //Mapping de la ruta base
    public String inicio(Model model) {
       log.info("Proyecto con MVC");
//       String mensaje = "Estamos en semana 6. Saludos";
//       model.addAttribute("MensajeSaludo", mensaje);
//       
//       Estado estado = new Estado(506,"Costa Rica","San Jose",1,5000000,"GMT-6");
//       Estado estado2 = new Estado(1,"A","B",1,5000000,"CCC-0");
//       Estado estado3 = new Estado(100,"X","Y",1,5000000,"ZZZ-9");
//
//        //model.addAttribute("estado", estado);
//       
//       List<Estado> estados = Arrays.asList(estado,estado2,estado3); //Devuelve una lista de T
//       model.addAttribute("estados", estados);
//       

        
        var estados = estadoService.getEstados();
        //var estados = Arrays.asList();
        model.addAttribute("estados", estados);
       return "index";
    }
   
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado estado){
        return "modificarEstado";
    }
    
    @PostMapping("/guardarEstado")
    public String guardarEstado(Estado estado){
        estadoService.save(estado);
        return "redirect:/"; //Esto no retorna la vista sino que al metodo controller de la vista index
    }
    
    @GetMapping("/modificarEstado/{id_pais}")
    public String modificarEstado(Estado estado, Model model){
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado",estado);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{id_pais}")
    public String eliminarEstado(Estado estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
    
    @RequestMapping("/")
    public String page(Model model) {
        return "Index";
    }
    
}
