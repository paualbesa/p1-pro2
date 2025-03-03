package prog2.model;

import prog2.vista.ExcepcioReserva;

public class Client {
    String nom;
    String dni;

    public Client(String nom, String dni) throws ExcepcioReserva {
        this.nom = nom;
        if(dni.length() != 9){
            throw new ExcepcioReserva("DNI incorrecte");
        }
        else{
            this.dni = dni;
        }
    }

    public String getNom() {
        return nom;
    }
    public String getDni() {
        return dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}
