package model;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.UnsupportedOperationException;

public class ContactDAO implements IContactDAO {
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public boolean exists(String name)
	{
		Session session = this.sessionFactory.openSession();
		List<Contact> contactList = session.createQuery("from Contact where name = :name").setParameter("name", name).list();
		session.close();
		return contactList.size() > 0;
	}

	public void save(Contact contact){
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(contact);
		tx.commit();
		session.close();		
	}
	
	public List<Contact> list(){
		Session session = this.sessionFactory.openSession();
		List<Contact> contactList = session.createQuery("from Contact").list();
		session.close();
		return contactList;
	}
	
	public List<Contact> list(int groupId) {
		throw new UnsupportedOperationException();
	}
}
