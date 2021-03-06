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
 * Examanatomopath generated by hbm2java
 */
@Entity
@Table(name = "examanatomopath", catalog = "odontoligie")
public class Examanatomopath implements java.io.Serializable {

	private Integer idExamAnatom;
	private Patient patient;
	private String image;
	private String commentaire;
	private String dateExam;

	public Examanatomopath() {
	}

	public Examanatomopath(Patient patient) {
		this.patient = patient;
	}

	public Examanatomopath(Patient patient, String image, String commentaire,
			String dateExam) {
		this.patient = patient;
		this.image = image;
		this.commentaire = commentaire;
		this.dateExam = dateExam;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_exam_anatom", unique = true, nullable = false)
	public Integer getIdExamAnatom() {
		return this.idExamAnatom;
	}

	public void setIdExamAnatom(Integer idExamAnatom) {
		this.idExamAnatom = idExamAnatom;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_patient", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Column(name = "image", length = 150)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "commentaire", length = 65535)
	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Column(name = "date_exam", length = 20)
	public String getDateExam() {
		return this.dateExam;
	}

	public void setDateExam(String dateExam) {
		this.dateExam = dateExam;
	}

}
