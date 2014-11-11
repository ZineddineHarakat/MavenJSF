package model;

// Generated 2 nov. 2014 20:01:30 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Collaboration generated by hbm2java
 */
@Entity
@Table(name = "collaboration", catalog = "odontoligie")
public class Collaboration implements java.io.Serializable {

	private Integer idColl;
	private Patient patient;
	private String commentaire;
	private String serviceColl;

	public Collaboration() {
	}

	public Collaboration(Patient patient) {
		this.patient = patient;
	}

	public Collaboration(Patient patient, String commentaire, String serviceColl) {
		this.patient = patient;
		this.commentaire = commentaire;
		this.serviceColl = serviceColl;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_coll", unique = true, nullable = false)
	public Integer getIdColl() {
		return this.idColl;
	}

	public void setIdColl(Integer idColl) {
		this.idColl = idColl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_patient", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Column(name = "commentaire", length = 65535)
	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Column(name = "service_coll", length = 20)
	public String getServiceColl() {
		return this.serviceColl;
	}

	public void setServiceColl(String serviceColl) {
		this.serviceColl = serviceColl;
	}

}