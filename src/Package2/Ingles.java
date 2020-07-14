package Package2;

public class Ingles extends Persona {

    public Ingles(){
        super(5);
        //this.saltos = 5;
    }

    public Ingles(int saltos){
        this.saltos = saltos;
    }

    public Ingles(String accion){
        this.saltos = 100;
    }

    //Sobreescritura
    @Override
    public String saludar(){
        return "hello";
    }
}
