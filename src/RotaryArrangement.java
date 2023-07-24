package src;

public class RotaryArrangement {
    Rotor[] configuration = new Rotor[3];

    public void setRotor(Rotor rotor, int position) {
        configuration[position] = rotor;
    }
}
