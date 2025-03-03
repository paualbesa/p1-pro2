package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camping implements InCamping{
    private String nom;
    private LlistaReserves llistaReserves;
    private ArrayList<Allotjament> llistaAllotjaments;
    private ArrayList<Client> llistaClients;

    public Camping(String nom){
        this.nom = nom;
        this.llistaReserves = new LlistaReserves();
        this.llistaAllotjaments = new ArrayList<Allotjament>();
        this.llistaClients = new ArrayList<Client>();
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public LlistaReserves getLlistaReserves() {
        return null;
    }

    @Override
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return null;
    }

    @Override
    public ArrayList<Client> getLlistaClients() {
        return null;
    }

    @Override
    public int getNumAllotjaments() {
        return 0;
    }

    @Override
    public int getNumReserves() {
        return 0;
    }

    @Override
    public int getNumClients() {
        return 0;
    }

    @Override
    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {

    }

    @Override
    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {

    }

    @Override
    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {

    }

    @Override
    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {

    }

    @Override
    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {

    }

    @Override
    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {

    }

    @Override
    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {

    }

    @Override
    public float calculMidaTotalParceles() {
        return 0;
    }

    @Override
    public int calculAllotjamentsOperatius() {
        return 0;
    }

    @Override
    public Allotjament getAllotjamentEstadaMesCurta() {
        return null;
    }
}
