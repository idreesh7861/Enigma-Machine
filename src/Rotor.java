package src;

public class Rotor {
    char[] configuration = new char[26];
    int rotation;
    public Rotor (char[] Configuration, int Rotation){
        configuration = Configuration;
        rotation = Rotation;
    }

    public void rotate(){
        if (rotation == 26) { rotation = 1; }
        else { rotation++; }
    }
}
