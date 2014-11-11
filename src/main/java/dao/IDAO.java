package dao;

import java.util.List;

public abstract class IDAO <T> 
{	/**
	 * Permet de récupérer un objet via son ID
	 * @param id
	 * @return
	 */
	public abstract T find(Integer id);
	
	
	/**
	 * Permet de créer une entrée dans la base de données
	 * par rapport à un objet
	 * @param obj
	 */
	public abstract boolean create(T obj);
  
	/**
	 * Permet de mettre à jour les données d'une entrée dans la base 
	 * @param obj
	 */
	public abstract void update(T obj);
	
	/**
	 * Permet la suppression d'une entrée de la base
	 * @param obj
	 */
	public abstract void remove(T obj);
	
    
   /**
	 * Permet de récupérer tous les objets 
	 * @return
	 */
	public abstract List<T> findAll();
	
}
