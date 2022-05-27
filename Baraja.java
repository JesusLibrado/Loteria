/*
// Baraja Class
//
// Represents a deck of Cartas with the input from the game (list of Cartas)
//
// Receives a list of strings 
//
*/

class Baraja {

    // store the current index of the Carta from the deck
    private int index;
    
    // actual Cartas
    private Carta[] cartas;

    // to keep locally the names of the Cartas
    public String[] nombresDeCartas;
    
    // receives a list of Carta names
    public Baraja(String[] nombresDeCartas) {
        this.nombresDeCartas = nombresDeCartas;
        index = 0;
        // create Cartas using the names received
        setCartas();
        
        // shuffle them Cartas
        shuffleCartas();
    }

    // Fisher-Yates sshuffling algorithm implementation
    private void shuffleCartas() {
        for(int i=0; i<cartas.length-2; i++){
            int minValue = i;
            int maxValue = cartas.length-1;
            int random = (int)Math.floor(Math.random()*(maxValue-minValue+1)+minValue);
            Carta temp = cartas[i];
            cartas[i] = cartas[random];
            cartas[random] = temp;
        };
    }

    // create Carta objects
    private void setCartas() {
        cartas = new Carta[this.nombresDeCartas.length];
        for(int i = 0; i<this.nombresDeCartas.length; i++){
            cartas[i] = new Carta(this.nombresDeCartas[i], i);
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public Carta getCarta() {
        return cartas[index++];
    }

    public int getNextNumero() {
        return index+1;
    }

    public Carta getCurrent() {
        return cartas[index];
    }

    public int getCurrentNumero() {
        return index;
    }

    public int size() {
        return cartas.length;
    }
}