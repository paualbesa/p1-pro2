package prog2.model;

public abstract class Allotjament implements InAllotjament{
    private String nom;
    private String id;
    private long estadaMinimaAlta;
    private long estadaMinimaBaixa;

    public Allotjament(String nom, String id){
        setNom(nom);
        setId(id);
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
}
