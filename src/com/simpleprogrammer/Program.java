package com.simpleprogrammer;

import org.hibernate.Session;

/**
 * Created by tethippe on 3/21/2016.
 */
public class Program {
    public static void main(String[] args) {

        System.out.println("HELLO!!");

        Session session = HibernateUtilities.getSessionFactory().openSession();

        session.close();
    }
}
