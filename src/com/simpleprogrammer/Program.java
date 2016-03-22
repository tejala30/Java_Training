package com.simpleprogrammer;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by tethippe on 3/21/2016.
 */
public class Program {
    public static void main(String[] args) {

        System.out.println("HELLO!!");

        Session session = HibernateUtilities.getSessionFactory().openSession();

        User user = new User();
        user.setName("Joe");
        user.setGoal(250);
        session.save(user);

        session.getTransaction();
        session.beginTransaction().commit();

        session.beginTransaction();

        User loadedUser = (User) session.load(User.class, 1);
        System.out.println(loadedUser.getName());
        System.out.println(loadedUser.getGoal());

        loadedUser.setTotal(loadedUser.getTotal() + 50);
        session.getTransaction().commit();

        session.close();


        HibernateUtilities.getSessionFactory().close();
    }
}
