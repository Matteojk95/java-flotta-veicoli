import java.util.ArrayList;

public class Gestoreflotta {

private ArrayList<Veicolo> list= new ArrayList<>();

public void aggiungiVeicolo (Veicolo veicolo) {
    list.add(veicolo);}

    public int contaTipoVeicoli(String tipo){
    int add =0;
    for ( Veicolo veicolo:list)  {
        if (veicolo.getTipo().equalsIgnoreCase(tipo)) {
            add++;
        }
    }
        return add;
    }

    public Veicolo findPerTarga(String numeroTarga) {
        for (Veicolo veicolo : list) {
            if (veicolo.getNumerotarga().equalsIgnoreCase(numeroTarga)) {
                return veicolo;
            }
        }
        return null;
    }

    public void tuttiIVeicoli() {
        for (Veicolo veicolo : list) {
            System.out.println(veicolo);
        }
    }
}







