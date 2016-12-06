package com.saadi.amir.database;

import com.saadi.amir.model.Topic;
import com.saadi.amir.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Amir on 2016-10-08.
 *  webstore
 */
public class Database {

    private static SessionFactory sessionFactory;
    public Database() {
    }

    private static   synchronized SessionFactory initDatabase() {

        if (sessionFactory == null) sessionFactory =
                new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }

    public void saveUser(User users){
        Transaction transaction = null;
        try (Session session = initDatabase().openSession()) {

            transaction = session.beginTransaction();
            session.save(users);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public List getUserByEmail(String email ){
        Transaction transaction = null;
        List list= new ArrayList<>();
        String hql = "FROM User WHERE Email=?";

        try (Session session = initDatabase().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter(0, email);
            list = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }

        return list;
    }

    public List getUser( ){

        String hql = "FROM User ";
        return runQuery(hql);
    }

    private List runQuery(String hibernateQuery){
        Transaction transaction = null;
        List list= new ArrayList<>();
        try (Session session = initDatabase().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery(hibernateQuery);
            list = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        return list;
    }

    public List getTopics(){

        String hql = "FROM Topic";
        return runQuery(hql);
    }

    public void addNewTopic(User author, String title, String content){
        Transaction transaction = null;
        List list;
        String hql = "FROM User WHERE Email=?";
        User user ;
        try (Session session = initDatabase().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            query.setParameter(0, author.getEmail());
            list = query.list();
            user = (User) list.get(0);
            Topic topic = new Topic(title, content, user.getName());
            session.save(topic);
            //ArrayList<Topic> topics = new ArrayList<Topic>(user.getTopics());

            user.getTopics().add(topic);
            session.update(user);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }

    }
}
