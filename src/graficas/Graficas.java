/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//PASO 1-IMPORTAR
import javax.swing.*;//Libreria gràfica estandar multiplataforma
import java.awt.*;//Libreria grafica del siatema Operativo
//PASO 8 - IMPORTAR LA CLASE QUE CONTIENE LA GUI
import gui.Miventana;//Paquete .clase

/**
 *
 * @author LAB08
 */
public class Graficas {

    /**
     * @param args the command line arguments
     */
    //PASO 9 - LLAMADO A LA CLASE
    public static void main(String[] args) 
    {
        Miventana miventana = new Miventana();//Creamos un objeto tipo JFrame
        miventana.setVisible(true);//Esta sentencia muestra la ventana
        miventana.setBounds(0,0,400,400);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra la ventana
    }
    
}
