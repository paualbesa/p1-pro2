package prog2.model;

public class Casa extends Allotjament{

    public enum Mides{
        PETITA,
        MITJANA,
        GRAN
    }

    private Mides mida;
    private int numHabitacions;
    private int numPlacesPersones;

    /* DEBO ASEGURARME DE QUE SE METE UNA DE LAS 3 OPCIONES POSIBLES, SINO LANZAR INTERRUPCIOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOON !!!!!
    */

    public Casa(String nom, String id, Mides mida, int numHabitacions, int numPlacesPersones){
        super(nom, id);
        this.mida = mida;
        this.numHabitacions = numHabitacions;
        this.numPlacesPersones = numPlacesPersones;
    }

    public int getHabitacions() {
        return numHabitacions;
    }

    public String getMida() {
        return mida.name();
    }

    public int getPlacesPersones() {
        return numPlacesPersones;
    }
}
