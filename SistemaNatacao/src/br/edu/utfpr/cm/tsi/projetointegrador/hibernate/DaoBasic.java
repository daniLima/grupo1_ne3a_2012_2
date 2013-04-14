/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.hibernate;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

/**
 *
 * @author Daniele
 */
public abstract class DaoBasic<T> {

    private static final Logger log = Logger.getLogger(DaoBasic.class.getName());

    public T get(long l) {
        Session session = getSession();
        Criteria c = session.createCriteria(getClassForEntity());
        c.add(Expression.eq("id", l));
        return (T) c.uniqueResult();
    }

    public List<T> getAll(int max) {
        Criteria c = getCriteria();
        c.setMaxResults(max);
        return c.list();
    }
    public List<T> getAll() {
        Session session = getSession();
        Criteria c = getCriteria();
        return c.list();
    }

    public void deleteAll() {
        try {
            Session session = getSession();
            Criteria c = session.createCriteria(getClassForEntity());
            session.beginTransaction().begin();

            for (Object o : c.list()) {
                session.delete(o);
            }

            session.flush();
            session.beginTransaction().commit();

        } catch (Exception e) {
        }
    }

    public void delete(T t) {
        try {
            Session session = getSession();
            session.beginTransaction().begin();
            session.delete(t);
            session.flush();
            session.beginTransaction().commit();

        } catch (Exception e) {
        }
    }

    public void persist(T t) {
        try {
            Session session = getSession();

            session.beginTransaction().begin();
            session.saveOrUpdate(t);
            session.flush();
            session.beginTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public Session getSession(Class type) {
        return HibernateUtil.getInstance().getSession(type);
    }

    public Session getSession() {
        return getSession(getClassForEntity());
    }

    public Class getClassForEntity() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void cloneEntity(T origem, T destino) {
        try {
            Class origemClass = origem.getClass();

            for (Method mGet : origemClass.getDeclaredMethods()) {
                processMethod(origem, destino, mGet);
            }
            for (Method mGet : origemClass.getMethods()) {
                processMethod(origem, destino, mGet);
            }

        } catch (Exception e) {
            log.log(Level.SEVERE, e.getMessage());
        }
    }

    private void processMethod(T origem, T destino, Method mGet) {
        if ("getClass".equals(mGet.getName())) {
            return;
        }

        if ("getId".equals(mGet.getName())) {
            return;
        }

        try {
            String mSGet = mGet.getName();
            String mSSet = "";
            if (mSGet.matches("(get|is)([A-Z])(\\w+)(\\S)")) {
                Object value = mGet.invoke(origem);

                if (mSGet.matches("(get)\\w+")) {
                    mSSet = "set" + mSGet.substring(3);

                    Method set = getMethod(destino.getClass(), mSSet, mGet.getReturnType());

                    if (set == null) {
                        return;
                    }
                    set.invoke(destino, value);
                }
            }

        } catch (Exception e) {
            log.log(Level.SEVERE, e.getMessage());
        }
    }

    private Method getMethod(Class type, String nome, Class... args) {
        try {
            Method m;
            try {
                m = type.getDeclaredMethod(nome, args);
            } catch (NoSuchMethodException e) {
                m = type.getMethod(nome, args);
            }

            return m;
        } catch (Exception e) {
            return null;
        }
    }

    public Criteria getCriteria() {
        return getCriteria(getClassForEntity());
    }

    public Criteria getCriteria(Class type) {
        return getSession().createCriteria(type);
    }
    
    public List<T> list(Criteria c){
        return c.list();
    }

    public boolean contains(Long id) {
        return get(id)!=null;
    }
}
