package orm.training.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import orm.training.entity.Jobs;
import orm.training.utils.HibernateUtils;

public class JobDaoImpl {
    
    public boolean save(Jobs job) throws Exception {
        Session session = null;
        Transaction transaction = null;
        
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            
            Serializable result = session.save(job);
            
            transaction.commit();
            
            return (result != null);
            
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
