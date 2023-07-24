package src;

public class Rotor {
    char[] configuration = new char[26];
    int currentRotation;
    public Rotor (char[] Configuration, int CurrentRotation){
        configuration = Configuration;
        currentRotation = CurrentRotation;
    }
}
