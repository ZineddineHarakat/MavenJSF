package bean;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;

import model.Personne;


@ManagedBean
@ViewScoped
public class PersonneBean 
{
	private Personne personne;
	private int nbr,nbrT;
	private String msg;
	private HtmlInputText input;
	private HtmlCommandButton button;
	private int nbrV;
	

	
	public PersonneBean() {
		super();
		nbrT=3;
		nbrV=new Random().nextInt()%10+1;
		System.out.println("nbr -->"+nbrV);
		personne=new Personne();
	}

	public void TestNbr()
	{
		if(nbr>nbrV && nbrT!=0)
		{
			msg="nbr >";
			nbrT--;	
		}
		else if(nbr<nbrV && nbrT!=0)
		{
			msg="nbr < ";
			nbrT--;	
		}
		else
			msg="OK";
		
		if(nbrT==0)
		{
			input.setReadonly(true);
			button.setDisabled(true);
		}
		
	}
	public void raz()
	{
		nbrT=3;
		input.setReadonly(false);
		button.setDisabled(false);
	}
/*	public void afficher()
	{
		System.out.println("nom -->"+personne.getNom());
		System.out.println("age -->"+personne.getAge());
	}*/
	
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	public int getNbrT() {
		return nbrT;
	}

	public void setNbrT(int nbrT) {
		this.nbrT = nbrT;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public HtmlInputText getInput() {
		return input;
	}

	public void setInput(HtmlInputText input) {
		this.input = input;
	}

	public HtmlCommandButton getButton() {
		return button;
	}

	public void setButton(HtmlCommandButton button) {
		this.button = button;
	}
	
	

}
