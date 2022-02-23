package com.practiceApp.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	SessionFactory factory;
    public void Adddata(Object o){
    	 
    	 Session session = factory.openSession();
    	    Transaction tx=session.beginTransaction();
    	    session.save(o);
    	    tx.commit();
    }
//    public com.practiceApp.Dao.Transaction GetData(int Cpin){
//    	com.practiceApp.Dao.Transaction transaction = session.load(com.practiceApp.Dao.Transaction.class, Cpin);
//    	return transaction;
//    }
}
