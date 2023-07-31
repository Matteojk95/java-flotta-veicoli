public class Automobili extends Veicolo {

//CAMPI

    private int numerodiporte;

    //COSTRUTTORE


    public Automobili(String numerotarga, int annodiimmatricolazione, int numerodiporte) {
        super(numerotarga, annodiimmatricolazione);
        this.numerodiporte = numerodiporte;
    }


    //GETTERS E SETTERS


    public int getNumerodiporte() {
        return numerodiporte;
    }


    //METODO


    @Override
    public String toString() {
        return "Automobili{" +
                "numerodiporte=" + numerodiporte +
                '}';
    }
}


