class Baraja {

    private int index;
    
    private Carta[] cartas;

    public String[] nombresDeCartas;
    
    public Baraja(String[] nombresDeCartas) {
        this.nombresDeCartas = nombresDeCartas;
        index = 0;
        setCartas();
        shuffleCartas();
    }

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

    public void print(Carta carta){
        System.out.printf("[%d]: %s\n", carta.getNumero(), carta.getNombre());
    }
}