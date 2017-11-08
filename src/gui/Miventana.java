/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//PASO 1-IMPORTAR
import graficas.*;
import javax.swing.*;//Libreria gràfica estandar multiplataforma
import java.awt.*;//Libreria grafica del siatema Operativo

/**
 *
 * @author LAB08
 */
//Paso 2 - HEREDAR MI CLASE DESDE JFRAME
public class Miventana extends JFrame {

      //PASO 3 - DECLARAR LOS ELEMENTOS QUE VAMOS A UTILIZAR
    JPanel mipanel;//Creacion de objeto JPanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    
    //PASO 4 - DEFINICION DEL CONSTRUCTOR DE LA CLASE
   
    public Miventana()//Tiene el mismo nombre de la clase
    
    {
       //PASO 5 -CREAR E INICIALIZAR LOS OBJETOS
        mipanel = new JPanel();
        milabel = new JLabel();
        mitexto = new JTextField(10);//10 son los caracteres
        miboton = new JButton();
        //PASO 6 - AGREGAR LOS ELEMENTOS AL JFRAME
        this.add(mipanel);//Agrego el JPanel al JFrame
        mipanel.add(milabel);
        mipanel.add(mitexto);
        mipanel.add(miboton);
        //PASO 7 -PROPIEDADES DE LOS ELEMENTOS
        milabel.setText("campo");
        miboton.setText("presioname");
        
    }
   
    /*public static void main(String[] args) 
    {
        JFrame miventana = new JFrame();//Creamos un objeto tipo JFrame
        miventana.setVisible(true);//Esta sentencia muestra la ventana
        miventana.setBounds(0,0,400,400);//Le asignamos tamaño a la ventana
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra la ventana

    }*/
    
}
