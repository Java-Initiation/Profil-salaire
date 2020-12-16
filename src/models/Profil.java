package models;

public class Profil {

    private int id;
    private String code, libelle;

    public Profil(int id, String code, String libelle) {
        this.id = id;
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

}
