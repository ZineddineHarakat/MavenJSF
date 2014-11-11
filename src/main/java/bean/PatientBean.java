package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Patient;


@ManagedBean
@ViewScoped
public class PatientBean 
{
	private Patient patient;

	public PatientBean() {
		super();
		patient=new Patient();
	}
	
	public void afficher()
	{
		System.out.println("nom -->"+patient.getNom());
		System.out.println("prenom -->"+patient.getPrenom());
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

}
