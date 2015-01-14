package org.application.bean;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class GenericDAO implements Serializable{

	   private static EntityManagerFactory emf = Persistence
	            .createEntityManagerFactory("persistence-unit");
	 
	    public EntityManager createEntityManager() {
	        return emf.createEntityManager();
	    }
	 
	    public static void closeEntityManager() {
	        emf.close();
	    }
}
