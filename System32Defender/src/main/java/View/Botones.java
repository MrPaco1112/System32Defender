

package View;

import javax.swing.*;
public class Botones {
    //Atribs
    //private String texto;
    private int numBoton;
    private int posX;
    private int posY;
    private JButton boton;
    
    public Botones( int numBoton, int posX, int posY, JButton boton){
        //this.texto = texto;
        this.numBoton = numBoton;
        this.posX = posX;
        this.posY = posY;
        this.boton = boton;
    }
    //Getters
    public int getNumBoton(){
        return numBoton;
    }
    /*public String getTexto(){
        return texto;
    }*/
    
    public static void cerrarVentana(JFrame ventana,Ventanas vent){
        
        ventana.setVisible(false);
        
    }
    public static void cambiarVentana( JFrame ventana, Ventanas vent){
        Ventanas.abrirVentana(ventana,1000,1000);
    }
    public static void respuestaCorrecta(){
        
    }
    public static void respuestaIncorrecta(){
        
    }
}
