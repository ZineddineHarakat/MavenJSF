package dao;

import java.util.List;

import org.hibernate.Session;

import util.HibernateUtil;

public class DAO <T> 
{
    private Class<T> entityClass;

    public DAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
	@SuppressWarnings("unchecked")
	public T find(Integer id) 
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		T obj = (T) session.get(entityClass, id);
		session.getTransaction().commit();
		return obj;
	}
    public boolean create(T obj) 
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();	
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		System.out.println(" ajouter");
		return true;	
	}
	public void remove(T obj) 
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(obj);
		session.getTransaction().commit();
		System.out.println("delet ok !");
		
	}
	public void update(T obj) 
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(obj);	
		session.getTransaction().commit();
		System.out.println("update ok !");
	
	}
	@SuppressWarnings("unchecked")
	public List<T> findAll() 
	{
		Session session=HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<T> list=session.createCriteria(entityClass).list();
		//List<T> list=session.createQuery("from "+entityClass).list();
		session.getTransaction().commit();
		return list;
	}
}
