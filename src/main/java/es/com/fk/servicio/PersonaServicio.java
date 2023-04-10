/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.com.fk.servicio;

import es.com.fk.domain.Persona;
import java.util.List;

/**
 *
 * @author ferca
 */
public interface PersonaServicio {
    
    public List<Persona> listarPersonas();
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona encontrarPersona(Persona persona);
    
    
    
    
}
