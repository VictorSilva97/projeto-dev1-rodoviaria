/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.victor.projeto.modelo.dao;
import br.edu.ifrs.restinga.dev1.victor.projeto.modelo.entidade.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Victor
 */
@Repository
public interface IUsuarioDAO extends CrudRepository<Usuario, Integer> {
    
}
