package model;

// Generated 2 nov. 2014 20:01:30 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Medecin generated by hbm2java
 */
@Entity
@Table(name = "medecin", catalog = "odontoligie")
public class Medecin implements java.io.Serializable {

	private Integer idMedecin;
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String email;
	private String tele;
	private Boolean actif;
	private Set patients = new HashSet(0);

	public Medecin() {
	}

	public Medecin(String login, String password, String nom, String prenom,
			String email, String tele, Boolean actif, Set patients) {
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tele = tele;
		this.actif = actif;
		this.patients = patients;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_medecin", unique = true, nullable = false)
	public Integer getIdMedecin() {
		return this.idMedecin;
	}

	public void setIdMedecin(Integer idMedecin) {
		this.idMedecin = idMedecin;
	}

	@Column(name = "login", length = 30)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "password", length = 60)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "nom", length = 30)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", length = 30)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "email", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tele", length = 30)
	public String getTele() {
		return this.tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	@Column(name = "actif")
	public Boolean getActif() {
		return this.actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medecin")
	public Set getPatients() {
		return this.patients;
	}

	public void setPatients(Set patients) {
		this.patients = patients;
	}

}