/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HolaSpring.DAO;

import com.example.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface IPersonaDAO extends CrudRepository<Persona, Long>{
    
}
