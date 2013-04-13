/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.hibernate;

import java.util.List;

/**
 *
 * @author Daniele
 */
public interface Dao<T> {
    void close();
    
    void delete(T e);
    
    List<T> get();
    
    T get(Object id);
    
    Class getClassForEntity();
    
    DaoGenerico<T> getDao();
    
    List<T> list(Object value,String...fields);
    
    List<T> list (Criteria criteria);
    
    void persist (T e);
    
    public static class Criteria {

        public Criteria() {
        }
    }
    
    
    
    
    
}
