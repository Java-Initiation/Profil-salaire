package models;

public class Utilisateur extends Personne {

    private String login, password, service;
    private Profil profil;

    public Utilisateur(int id, String nom, String prenom, String mail, String telephone, double salaire, String login, String password, String service, Profil profil) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profil = profil;
    }

    @Override
    public double calculerSalaire() {
        double totalSalaire = super.calculerSalaire();
        if (profil.getCode().equals("MN"))
            totalSalaire += totalSalaire * 0.10;
        else if (profil.getCode().equals("DG"))
        totalSalaire += totalSalaire * 0.40;
        return totalSalaire;
    }
}
