/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.com.fk.dao;

import es.com.fk.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ferca
 */
public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
