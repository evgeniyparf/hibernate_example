package helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.*;

public class App
{
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Student student = new Student();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.getSessionFactory().close();
    }
}
