package prog2.model;

public abstract class Allotjament implements InAllotjament{
    private String nom;
    private String id;
    private long estadaMinimaAlta;
    private long estadaMinimaBaixa;

    public Allotjament(String nom, String id, long estadaMinimaAlta, long estadaMinimaBaixa) {
        this.nom = nom;
        this.id = id;
        this.estadaMinimaAlta = estadaMinimaAlta;
        this.estadaMinimaBaixa = estadaMinimaBaixa;
    }

    public Allotjament(String nom, String id) {
        this.id = id;
        this.nom = nom;
    }

    public long getEstadaMinima(InAllotjament.Temp temp) {
        if (temp == InAllotjament.Temp.ALTA) {
            return estadaMinimaAlta;
        } else {
            return estadaMinimaBaixa;
        }
    }

    @Override
    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        estadaMinimaAlta = estadaMinimaALTA_;
        estadaMinimaBaixa = estadaMinimaBAIXA_;
    }

    @Override
    public boolean correcteFuncionament() {
        return false;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEstadaMinima(int alta, int baixa) {
        estadaMinimaAlta = alta;
        estadaMinimaBaixa = baixa;
    }

    @Override
    public String toString() {
        return "Nom=" + nom + ", Id=" + id + ", estada mínima en temp ALTA: " + estadaMinimaAlta + ", estada mínima en temp BAIXA: " + estadaMinimaBaixa + ".";
    }
}
