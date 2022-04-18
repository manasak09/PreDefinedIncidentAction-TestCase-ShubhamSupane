
package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class PreDefinedIncidentAction {
	
	@Id
	@GeneratedValue
	@NotNull
	private int incidentId;
	
	
    @Size(min=1,max=100)
	private String jobDescription;
	
	@NotNull
    @Size(min=1,max=100)
	private String incidentName;
	
	
    @Size(min=2,max=3)
	private String anyInjuries;
	
	
    @Size(min=3,max=100)
	private String injuryDescription;


	private String predefinedincidentName;


	private Object predefinedincidentId;
	
	public PreDefinedIncidentAction ()
	{
		
	}

	public int getPIncidentId() {
		return incidentId;
	}

	public void setPreDefinedIncidentId(int incidentId) {
		this.predefinedincidentId = predefinedincidentId;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getPreDefinedIncidentName() {
		return predefinedincidentName;
	}

	public void setPreDefinedIncidentName(String predefinedincidentName) {
		this.predefinedincidentName = predefinedincidentName;
	}

	public String getAnyInjuries() {
		return anyInjuries;
	}

	public void setAnyInjuries(String anyInjuries) {
		this.anyInjuries = anyInjuries;
	}

	public String getInjuryDescription() {
		return injuryDescription;
	}

	public void setInjuryDescription(String injuryDescription) {
		this.injuryDescription = injuryDescription;
	}

	public Object PreDefinedIncidentName() {
		return null;
	}

	
	
}
	