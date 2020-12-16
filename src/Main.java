import models.Personne;
import models.Profil;
import models.Utilisateur;

public class Main {

    public static void main(String[] args) {

        Profil profilCP = new Profil(1, "CP", "Chef de projet");
        Profil profilMN = new Profil(2, "MN", "Manager");
        Profil profilDP = new Profil(3, "DP", "Directeur de projet");
        Profil profilDRH = new Profil(4, "DRH", "Directeur des ressources humaines");
        Profil profilDG = new Profil(5, "DG", "Directeur général");

        Utilisateur utilisateur = new Utilisateur(
                42,
                "Dupond",
                "Jean",
                "mail@mail.com",
                "0623232323",
                2000,
                "dupond",
                "password",
                "service",
                profilDG
        );

        System.out.println(utilisateur.calculerSalaire());


    }

}
