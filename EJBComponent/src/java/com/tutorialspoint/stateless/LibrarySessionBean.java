/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorialspoint.stateless;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rbnra
 */
@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote {

   // Add business logic below. (Right-click in editor and choose
   // "Insert Code > Add Business Method")
    
   List<String> bookShelf;    
   
   public LibrarySessionBean(){
      bookShelf = new ArrayList<String>();
   }
    
   @Override
   public void addBook(String bookName) {
      bookShelf.add(bookName);
   }    
 
   @Override
   public List<String> getBooks() {
      return bookShelf;
   }
}
