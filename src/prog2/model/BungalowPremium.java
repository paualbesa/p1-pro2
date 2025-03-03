package prog2.model;

public class BungalowPremium extends Bungalow{
    private boolean serveisExtra;
    private String codiWifi;

    public BungalowPremium(String nom, String id, String mida, int numHabitacions, int numPlacesPersones, int numPlacesParquing, boolean isTerrassa, boolean isTV, boolean isAireFred, boolean serveisExtra, String codiWifi) {
        super(nom, id, mida, numHabitacions, numPlacesPersones, numPlacesParquing, isTerrassa, isTV, isAireFred);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    public boolean isServeisExtra() {
        return serveisExtra;
    }

    public String getCodiWifi() {
        return codiWifi;
    }

    public void setServeisExtra(boolean serveisExtra) {
        this.serveisExtra = serveisExtra;
    }

    public void setCodiWifi(String codiWifi) {
        this.codiWifi = codiWifi;
    }

    @Override
    public boolean correcteFuncionament() { // codiWifi.length() > 0
        return isAireFred() && codiWifi.length() >= 8 && codiWifi.length() <= 16;
    }

    @Override
    public String toString() {
        return "BungalowPremium{" + "serveisExtra=" + serveisExtra + ", codiWifi=" + codiWifi + '}';
    }
}
