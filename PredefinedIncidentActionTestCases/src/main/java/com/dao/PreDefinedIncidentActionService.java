package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.PreDefinedIncidentAction;


@Service
public class PreDefinedIncidentActionService {
	@Autowired
	PreDefinedIncidentActionDAO predefinedincidentActionDAOImpl;
	public void addPreDefinedIncident(PreDefinedIncidentAction action) 
	{
		 predefinedincidentActionDAOImpl.addPreDefinedIncidentAction(action);
	}
	public com.model.PreDefinedIncidentAction findPreDefinedIncident(int id) {
		return predefinedincidentActionDAOImpl.findPreDefinedIncident(id);
		
	}

	public boolean updatePreDefinedIncidentAction(PreDefinedIncidentAction action) {
		return predefinedincidentActionDAOImpl.updatePreDefinedIncidentAction(action);
	}
	public boolean deletePreDefinedIncidentAction(PreDefinedIncidentAction action) {
		return predefinedincidentActionDAOImpl.deletePreDefinedIncidentAction(action);
	}
	public void updateAction(PreDefinedIncidentAction action) {
		predefinedincidentActionDAOImpl.addPreDefinedIncidentAction(action);
		
	}
	public Object deleteAction(int id) {
		return predefinedincidentActionDAOImpl.findPreDefinedIncident(id);
	}
	public List<PreDefinedIncidentAction> findAllPreDefinedIncidentAction() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
