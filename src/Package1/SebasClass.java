package Package1;

import exception.SebasNotFoundException;

public class SebasClass {

    private boolean estadoSebas;

    SebasClass(){
        this.estadoSebas = true;
    }

    public boolean sebasEstaDisponible() {

        if(estadoSebas) {
            return estadoSebas;
        } else {
            throw new SebasNotFoundException("En este momento Sebastián no está disponible para nadie");
        }
    }

    public void cambiarEstadoSebas(){
        this.estadoSebas = !estadoSebas; //NOT(estadoSebas)
    }
}
