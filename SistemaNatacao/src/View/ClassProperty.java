/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Daniele
 */
@Target(ElementType.TYPE) //alvo aonde programa pode usar essa anotação
@Retention(RetentionPolicy.RUNTIME)//em tempo de execucaoque momento essa anotação deve permancr no seu codigo

public @interface ClassProperty {
    String label();
    
    
    
}
