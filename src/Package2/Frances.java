package Package2;

public class Frances extends Persona {

    @Override
    public String saludar() {
        return "Bonjeur";
    }

    @Override
    public String saltar() {
        saltos = saltos + 2;
        return "He saltado " + saltos + " veces";
    }
}
