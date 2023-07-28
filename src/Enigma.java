package src;

public class Enigma {
    public RotaryArrangement RotorArrangement = new RotaryArrangement();

    public Enigma(Rotor Rotor_1, Rotor Rotor_2, Rotor Rotor_3){
        RotorArrangement.setRotor(Rotor_1, 0);
        RotorArrangement.setRotor(Rotor_2, 1);
        RotorArrangement.setRotor(Rotor_3, 2);
    }
}
