public  abstract class Veicolo {

    //CAMPI
    private String tipo;
    private String numerotarga;
    private int annodiimmatricolazione;
//COSTRUTTORE

    public Veicolo(String tipo, String numerotarga, int annodiimmatricolazione) {
        this.tipo = tipo;
        this.numerotarga = numerotarga;
        this.annodiimmatricolazione = annodiimmatricolazione;
    }


    //GETTERS E SETTERS


    public String getTipo() {
        return tipo;
    }

    public String getNumerotarga() {
        return numerotarga;
    }

    public int getAnnodiimmatricolazione() {
        return annodiimmatricolazione;
    }


    //METODO


    @Override
    public String toString() {
        return "Veicolo{" +
                "numerotarga='" + numerotarga + '\'' +
                ", annodiimmatricolazione=" + annodiimmatricolazione +
                '}';
    }


}
