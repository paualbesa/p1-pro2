package prog2.model;

public class Parcela extends Allotjament{
    private float mida;
    boolean connexioElectrica;
    public Parcela(String nom, String id, float mida, boolean connexioElectrica) {
        super(nom, id);
        this.mida = mida;
        this.connexioElectrica = connexioElectrica;
    }

    public float getMida() {
        return mida;
    }

    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }
}
