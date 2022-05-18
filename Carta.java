/*
// Carta Class
//
// Represents each Carta of the game 
//
// Constructor receives a nombre (name) and a numero (ID)
//
*/


class Carta {
    public String nombre;
    public int numero;

    public Carta(String nombre, int numero){
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getNumero(){
        return this.numero;
    }

}