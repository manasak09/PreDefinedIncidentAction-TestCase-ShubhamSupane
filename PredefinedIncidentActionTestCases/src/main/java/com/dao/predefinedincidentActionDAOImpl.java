package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.PreDefinedIncidentAction;

@Component
public class predefinedincidentActionDAOImpl  implements PreDefinedIncidentActionDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Override
	public PreDefinedIncidentAction findPreDefinedIncident(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		PreDefinedIncidentAction action=session.get(PreDefinedIncidentAction.class, id);
		return action;
		
	}


	@Override
	public boolean updatePreDefinedIncidentAction(PreDefinedIncidentAction action) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(session);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deletePreDefinedIncidentAction(PreDefinedIncidentAction action) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(session);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public List<PreDefinedIncidentAction> findAllPreDefinedIncidentAction() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<PreDefinedIncidentAction> PreDefinedIncidentlist=session.createQuery("select i from PreDefinedIncidentAction i").list();
		return PreDefinedIncidentlist;
	}

	

	@Override
	public void addPreDefinedIncidentAction(PreDefinedIncidentAction action) {
		// TODO Auto-generated method stub
Session session=sessionFactory.openSession();
		
		session.getTransaction().begin();
		session.save(action);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		
	}


	@Override
	public boolean deletePreDefinedIncidentAction(int id) {
		// TODO Auto-generated method stub
		return false;
	}


	


	

}
		






















