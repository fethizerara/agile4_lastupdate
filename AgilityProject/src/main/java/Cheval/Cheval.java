package Cheval;

import java.util.ArrayList;
import java.util.List;

import gestionLivre.Livre;

/**
 * D�crivez votre classe Cheval ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Cheval
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
    private int id = 1;
    private int age = 20;
    private Box box;
	private List<Livre> listeLivreEcrit;
    private List<Livre> listeLivreLu;
    
    public Cheval() {    	
    	listeLivreEcrit = new ArrayList<Livre>();
    	listeLivreLu = new ArrayList<Livre>();
	}
    
    /**
     * Constructeur d'objets de classe Cheval
     */
    public Cheval(int _numero,int _age)
    {
        // initialisation des variables d'instance
        this.id = _numero;
        this.age = _age;
        this.box = null;
    	listeLivreEcrit = new ArrayList<Livre>();
    	listeLivreLu = new ArrayList<Livre>();
        
    }


    public void setListeLivreEcrit(List<Livre> listeLivreEcrit) {
		this.listeLivreEcrit = listeLivreEcrit;
	}

	public void setListeLivreLu(List<Livre> listeLivreLu) {
		this.listeLivreLu = listeLivreLu;
	}

	public Box getBox() {
        return this.box;
    }

    public void setBox(Box _box) {
        this.box = _box;
    }



    public int getId (){

        return this.id;
    }


    public void setId(int _numero){
        this.id = _numero;
    }

    public int getAge (){

        return this.age;
    }


    public void setAge(int _age){
        this.age = _age;
    }
    
    
    public List<Livre> getListeLivreEcrit() {
		return listeLivreEcrit;
	}

	public List<Livre> getListeLivreLu() {
		return listeLivreLu;
	}



    /**
     * Un exemple de m�thode - remplacez ce commentaire par le v�tre
     *
     * @param  y   le param�tre de la m�thode
     * @return     la somme de x et de y
     */
    public String statutCheval()
    {
        // Ins�rez votre code ici
        return "le statut du cheval "+ this.id + " : age => "+this.age;
    }
}
