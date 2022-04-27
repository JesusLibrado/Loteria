import input.Reader;

class Main{
    public static void main(String args[]){
        String cartasInputFile = "cartas.txt";
        Reader cartasReader = new Reader(cartasInputFile);
        Baraja baraja = new Baraja(cartasReader.asArray());
        for(int turno = 0; turno < baraja.size(); turno++){
            Carta cartaEnTurno = baraja.getNext();
            baraja.print(cartaEnTurno);
        }
    }
}