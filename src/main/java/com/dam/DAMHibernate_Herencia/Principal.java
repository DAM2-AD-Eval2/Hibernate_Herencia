package com.dam.DAMHibernate_Herencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Principal {

	public static void main(String[] args) {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		
		Session session = sf.openSession();
		
		
		session.getTransaction().begin();
		
			Persona persona1 = new Alumno("11111111A", "Pepito", 23, "DAM");
			Persona persona2 = new Profesor("22222222B", "Fulanito", 36, 3);
		
			session.save(persona1);
			session.save(persona2);
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
