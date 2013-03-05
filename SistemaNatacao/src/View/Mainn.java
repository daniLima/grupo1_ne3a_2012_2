/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.FlowLayout;
import java.lang.reflect.Method;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Daniele
 */
public class Mainn {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setId(1);
        c.setNome("dani");

        showObject(c);




    }

    public static void showObject(Object obj) {
        JDialog dialog = new JDialog();

    //    dialog.setSize(obj.getClass().getAnnotation(ClassProperty.class).width(), 300); //width q esta a na classe classproperty
        dialog.setLocationRelativeTo(null);

        dialog.setTitle("V" + obj.getClass().getSimpleName());//invez de get simple name via seer get label pegar nom simples//agora é getAnnotATION(ClassProperty.class).label());//para aparecer o nome 
        dialog.setLayout(new FlowLayout());



        for (Method m : obj.getClass().getMethods()) {
            if (m.getName().startsWith("get")) {
      MethodProperty  anot =  m.getAnnotation(MethodProperty.class); //
                dialog.add(new JLabel(anot.label() + ","));
                try {
                    dialog.add(new JTextField(m.invoke(obj, null).toString(), 15));//invocando metodo m 

                } catch (Exception ex) {
                    dialog.add(new JTextField(ex.getMessage()));
                }
            }
        }
        dialog.setVisible(true);

    }
}