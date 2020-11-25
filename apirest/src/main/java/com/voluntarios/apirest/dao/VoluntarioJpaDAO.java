package com.voluntarios.apirest.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.voluntarios.apirest.models.Voluntario;

/**
 * @author mauro
 *
 */
public class VoluntarioJpaDAO {

	private static VoluntarioJpaDAO instance;
	protected EntityManager entityManager;

	public static VoluntarioJpaDAO getInstance() {
		if (instance == null) {
			instance = new VoluntarioJpaDAO();
		}
		return instance;
	}

	public static void setInstance(VoluntarioJpaDAO instance) {
		VoluntarioJpaDAO.instance = instance;
	}

	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Voluntario consultaPorId(long id) {
		return getEntityManager().find(Voluntario.class, id);
	}

}
