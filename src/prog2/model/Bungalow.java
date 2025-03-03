package prog2.model;

public class Bungalow extends Casa {
    private int numPlacesParquing;
    private boolean isTerrassa;
    private boolean isTV;
    private boolean isAireFred;

    public Bungalow(String nom, String id, String mida, int numHabitacions, int numPlacesPersones, int numPlacesParquing, boolean isTerrassa, boolean isTV, boolean isAireFred) {
        super(nom, id, mida, numHabitacions, numPlacesPersones);
        this.numPlacesParquing = numPlacesParquing;
        this.isTerrassa = isTerrassa();
        this.isTV = isTV;
        this.isAireFred = isAireFred;
    }

    public void setEstadaMinima(int i, int i1) {
    }

    public String getMida() {
        return super.getMida();
    }

    public int getHabitacions() {
        return super.getHabitacions();
    }

    public int getPlacesPersones() {
        return super.getPlacesPersones();
    }

    public int getPlacesParquing() {
        return numPlacesParquing;
    }


    public boolean isTerrassa() {
        return isTerrassa;
    }

    public boolean isTv() {
        return isTV;
    }

    public boolean isAireFred() {
        return isAireFred;
    }
}
