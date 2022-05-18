/*
// Main Class
//
// Primary game executable 
//
// Receives a file path as input (where to find the Cartas list)
//
*/


// import file reader (Reader Class) to get the Cartas list as a String[]
import input.Reader;

class Main{
    public static void main(String args[]){

        // hardcoded file path
        String cartasInputFile = "cartas.txt";

        //  open the file in a Reader 
        Reader cartasReader = new Reader(cartasInputFile);

        // create a new Baraja with the list from the Reader
        Baraja baraja = new Baraja(cartasReader.asArray());

        // loop through the Cartas and print them ["cantar las Cartas"]
        for(int turno = 0; turno < baraja.size(); turno++){

            // get Carta from Baraja
            Carta cartaEnTurno = baraja.getCarta();

            // "cantar la Carta", print the Carta
            cartaEnTurno.cantar();
        }
    }
}