package org.example.Db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Db {
    public static EntityManager provideConnection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sms");
        return emf.createEntityManager();
    }
//    public static EntityManager provideConnection1= Persistence
//            .createEntityManagerFactory("sms1")
//            .createEntityManager();

}
