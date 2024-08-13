package Proyecto2;
public class Persona {
	String nom,ape,tra,ed;
	int pos1;
	
	public Persona(String nom,String ape,String ed, String tra, int pos1) {
		super();
		this.nom = nom;
		this.ape = ape;
		this.tra = tra;
		this.ed = ed;
		this.pos1 = pos1;
	}
	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public int getPos1() {
		return pos1;
	}

	public void setPos1(int pos1) {
		this.pos1 = pos1;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTra() {
		return tra;
	}

	public void setTra(String tra) {
		this.tra = tra;
	}

	public String getEd() {
		return ed;
	}

	public void setEd(String ed) {
		this.ed = ed;
	}
}