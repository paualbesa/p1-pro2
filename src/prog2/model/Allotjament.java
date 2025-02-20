package prog2.model;

public class Allotjament {
    private String id;
    private String nom;
    private int estadaMinimaAlta;
    private int estadaMinimaBaixa;
    private boolean temporadadAlta;

    public Allotjament(String id, String nom, int estadaMinimaAlta, int estadaMinimaBaixa, boolean temporadadAlta) {
        this.id = id;
        this.nom = nom;
        this.estadaMinimaAlta = estadaMinimaAlta;
        this.estadaMinimaBaixa = estadaMinimaBaixa;
        this.temporadadAlta = temporadadAlta;
    }

    public int getEstadaMinima(InAllotjament.Temp temp) {

    }

    public String getId() {
    }

    public String getNom() {
    }

    public void setEstadaMinima(int i, int i1) {
    }
}
