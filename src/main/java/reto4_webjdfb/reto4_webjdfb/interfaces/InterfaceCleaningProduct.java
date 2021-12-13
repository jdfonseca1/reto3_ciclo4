/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4_webjdfb.reto4_webjdfb.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import reto4_webjdfb.reto4_webjdfb.modelo.CleaningProduct;

/**
 *
 * @author JorgeFonseca
 */
public interface InterfaceCleaningProduct extends MongoRepository<CleaningProduct, String>{
    
}
