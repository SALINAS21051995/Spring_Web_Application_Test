/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HolaSpring.DAO;

import com.example.HolaSpring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
