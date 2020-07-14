package Package2;

public class Persona implements IPersona {

    protected float distancia = 0;
    protected int saltos = 0;

    public Persona(){
    }

    public Persona(int saltos){
        this.saltos = saltos;
    }

    public String saludar(){
        return "hola";
    }

    public String correr(){
        return "He recorrido " + ++distancia + "km";
    }

    @Override
    public String comer() {
        return "Estoy comiendo";
    }

    public String saltar(){
        return "He saltado " + ++saltos + " veces";
    }
}
