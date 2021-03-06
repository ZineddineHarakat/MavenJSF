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
 * TraitChir generated by hbm2java
 */
@Entity
@Table(name = "trait_chir", catalog = "odontoligie")
public class TraitChir implements java.io.Serializable {

	private Integer idTraitChir;
	private Patient patient;
	private String commentaire;
	private String image;

	public TraitChir() {
	}

	public TraitChir(Patient patient) {
		this.patient = patient;
	}

	public TraitChir(Patient patient, String commentaire, String image) {
		this.patient = patient;
		this.commentaire = commentaire;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_trait_chir", unique = true, nullable = false)
	public Integer getIdTraitChir() {
		return this.idTraitChir;
	}

	public void setIdTraitChir(Integer idTraitChir) {
		this.idTraitChir = idTraitChir;
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

	@Column(name = "image", length = 150)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
