class Baraja {

    private int index;
    
    private Carta[] cartas;

    public String[] nombresDeCartas;
    
    public Baraja(String[] arrayOfCartas) {
        // receive list of cards as input
        // create another constructor that receives an array of strings
        this.nombresDeCartas = arrayOfCartas;

        // maybe set in another step?
        index = 0;

        // write a method for this. NOT in the constructor
        cartas = new Carta[this.nombresDeCartas.length];
        for(int i = 0; i<this.nombresDeCartas.length; i++){
            cartas[i] = new Carta(this.nombresDeCartas[i], i);
        }
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public Carta getNext() {
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

    public void print(Carta carta){
        System.out.printf("[%d]: %s\n", carta.getNumero(), carta.getNombre());
    }
}