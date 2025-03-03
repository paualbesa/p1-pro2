package prog2.model;

public class Casa extends Allotjament{
    private String mida;
    private int numHabitacions;
    private int numPlacesPersones;

    public Casa(String nom, String id, String mida, int numHabitacions, int numPlacesPersones) {
        super(nom, id);
        this.mida = mida;
        this.numHabitacions = numHabitacions;
        this.numPlacesPersones = numPlacesPersones;
    }

    public int getHabitacions() {
        return numHabitacions;
    }

    public String getMida() {
        return mida;
    }

    public int getPlacesPersones() {
        return numPlacesPersones;
    }
}
