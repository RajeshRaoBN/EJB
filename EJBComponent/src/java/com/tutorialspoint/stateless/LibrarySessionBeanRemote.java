/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import javax.ejb.Local;
import java.util.List;

/**
 *
 * @author rbnra
 */
@Local
public interface LibrarySessionBeanRemote {
    
    void addBook(String bookName);
 
    List getBooks();
    
}
