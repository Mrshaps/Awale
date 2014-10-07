package com.example.mrshaps.awale;

/**
 * Created by MrSHAPS on 07/10/14.
 */
public class Partie {


    public static final Object JOUEUR0 = "Jeueur 0" ;
    public static final Object JOUEUR1 = "Jeueur 1" ;
    private int[] plateaux;
    private int status_partie;
    private String graines_joueur_0;
    private String graines_joueur_1;

    public Partie(int[] plateaux, int status_partie, String graines_joueur_0, String graines_joueur_1) {
        this.plateaux = plateaux;
        this.status_partie = status_partie;
        this.graines_joueur_0 = graines_joueur_0;
        this.graines_joueur_1 = graines_joueur_1;
    }

    public Object getJoueur_actif() {
        return null;
    }

    public int[] getPlateaux() {
        return plateaux;
    }

    public int getStatus_partie() {
        return status_partie;
    }

    public String getGraines_joueur_0() {
        return graines_joueur_0;
    }

    public String getGraines_joueur_1() {
        return graines_joueur_1;
    }

    public void a_joue(int casecliquee) {

    }
}
