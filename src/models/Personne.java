package models;

public class Personne {

    protected int id;
    protected String nom, prenom, mail, telephone;
    protected double salaire;

    public Personne(int id, String nom, String prenom, String mail, String telephone, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public double calculerSalaire(){
        return salaire;
    }

    public String afficher() {
        return "models.Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + calculerSalaire() +
                '}';
    }
}
