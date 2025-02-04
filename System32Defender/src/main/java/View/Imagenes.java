
package View;

import javax.swing.*;
import java.awt.*;


public class Imagenes extends JPanel{
    //Atribs
    private Image imagen;
    private int anchoImagen;
    private int altoImagen ;
    private int posX;
    private int posY;
    
    //Inicializar atribs
    public Imagenes(String ruta, int anchoImagen, int altoImagen, int posX, int posY){
        this.imagen = new ImageIcon(ruta).getImage();
        this.altoImagen = altoImagen;
        this.anchoImagen = anchoImagen;
        this.posX = posX;
        this.posY = posY;
    }
    //Establecer dimensiones y mantener relacion de tamaño
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int anchoOriginal = imagen.getWidth(this);
        int altoOriginal = imagen.getHeight(this);
        double ratio = (double) anchoOriginal / altoOriginal;
        int nuevoAncho = anchoImagen;
        int nuevoAlto = (int) (anchoImagen / ratio);
        
        if (nuevoAlto > altoImagen) {
            // Si el nuevo alto excede el alto máximo, ajusta el alto
            nuevoAlto = altoImagen;
            nuevoAncho = (int) (altoImagen * ratio);
        }
        
        g.drawImage(imagen, posX, posY, nuevoAncho, nuevoAlto, this); // Dibuja la imagen redimensionada
    }
    
    
}
