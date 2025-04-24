package com.example.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entities.Employee;

public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Employee prueba = new Employee();
            prueba.setName("Paco");

            session.persist(prueba);
            transaction.commit();
            System.out.println("¡Empleado guardado correctamente!");
            session.close();
            sf.close();

        } catch (Exception e) {
            
        }
    }

}
