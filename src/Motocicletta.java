public class Motocicletta extends Veicolo {

    //CAMPI

    private boolean hoilcavalletto;


//COSTRUTTORE

    public Motocicletta(String numerotarga, int annodiimmatricolazione, boolean hoilcavalletto) {
        super(numerotarga, annodiimmatricolazione);
        this.hoilcavalletto = hoilcavalletto;
    }


// GETTERS E SETTERS


    public boolean isHoilcavalletto() {
        return hoilcavalletto;
    }


//METODI


    @Override
    public String toString() {
        return "Motocicletta{" +
                "hoilcavalletto=" + hoilcavalletto +
                '}';

    }
}