
package org.rodrigocardenas.system;

import javax.swing.JOptionPane;

import org.rodrigocardenas.bean.Suma;
import org.rodrigocardenas.bean.Resta;
import org.rodrigocardenas.bean.Multiplicacion;
import org.rodrigocardenas.bean.Division;
import org.rodrigocardenas.bean.Salir;

/*
    Programador - Alumno:	
		Rodrigo Gerardo Cárdenas Monroy

    Carné:
		2020166

    Creación
		09/03/2021

    Modificaciones
		10/03/2021
                12/03/2021
                13/03/2021
                14/03/2021
                15/03/2021
*/

public class Principal 
{
    
    public static void main(String[] args) 
    {
        
       Suma suma = new Suma(0,0);
       Resta resta = new Resta(0,0);
       Multiplicacion multiplicacion = new Multiplicacion(0,0);
       Division division = new Division(0,0);
       Salir salir = new Salir();
               
       int opcionElegida;
       int retornar = 1;
       
       JOptionPane.showMessageDialog(null, " Programador : \n "
                                    + "               Rodrigo Cárdenas - 2020166 ",
                                    " BIENVENID@ ", JOptionPane.INFORMATION_MESSAGE);
       
       do
       {
            opcionElegida = Integer.parseInt(JOptionPane.showInputDialog(
                                        null, " MENÚ CALCULADORA \n "
                                        + " 1. Suma \n "
                                        + " 2. Resta \n "
                                        + " 3. Multiplicación \n "
                                        + " 4. División \n "
                                        + " 5. Salir \n \n"
                                        + " Seleccione una Opción "
                                        ," CALCULADORA BÁSICA " ,JOptionPane.PLAIN_MESSAGE
                                        ));

            switch (opcionElegida)
            {
                
                case 1:
                    suma.setNumeroUno(Double.parseDouble(JOptionPane.showInputDialog(
                            null, " Ingrese el primer valor ", " SUMA ", JOptionPane.PLAIN_MESSAGE)));
                    suma.setNumeroDos(Double.parseDouble(JOptionPane.showInputDialog(
                            null, " Ingrese el segundo valor ", " SUMA ", JOptionPane.PLAIN_MESSAGE)));
                    
                    JOptionPane.showMessageDialog(null, " SUMA : \n "
                                                  + String.valueOf(suma.getNumeroUno()) + "  +  " + String.valueOf(suma.getNumeroDos()) + "  =  "
                                                  + String.valueOf(suma.metodoSuma(suma.getNumeroUno(), suma.getNumeroDos()))
                                                  + "\n \n El Resultado es :  "
                                                  + String.valueOf(suma.metodoSuma(suma.getNumeroUno(), suma.getNumeroDos())),
                                                  " SUMA ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                    
                case 2:  
                    resta.setNumeroUno(Double.parseDouble(JOptionPane.showInputDialog(
                            null," Ingrese el primer valor ", " RESTA ", JOptionPane.PLAIN_MESSAGE)));
                    resta.setNumeroDos(Double.parseDouble(JOptionPane.showInputDialog(
                            null," Ingrese el segundo valor ", " RESTA ", JOptionPane.PLAIN_MESSAGE)));
                    
                    JOptionPane.showMessageDialog(null, " RESTA : \n "
                                                  + String.valueOf(resta.getNumeroUno()) + "  -  " + String.valueOf(resta.getNumeroDos()) + "  =  "
                                                  + String.valueOf(resta.metodoResta(resta.getNumeroUno(), resta.getNumeroDos()))
                                                  + "\n \n El Resultado es :  "
                                                  + String.valueOf(resta.metodoResta(resta.getNumeroUno(), resta.getNumeroDos())), 
                                                  " RESTA ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                    
                case 3:
                    multiplicacion.setNumeroUno(Double.parseDouble(JOptionPane.showInputDialog(
                            null," Ingrese el primer valor ", " MULTIPLICACIÓN ", JOptionPane.PLAIN_MESSAGE)));
                    multiplicacion.setNumeroDos(Double.parseDouble(JOptionPane.showInputDialog(
                            null," Ingrese el segundo valor ", " MULTIPLICACIÓN ", JOptionPane.PLAIN_MESSAGE)));
                    
                    JOptionPane.showMessageDialog(null, " MULTIPLICACIÓN : \n "
                                                  + String.valueOf(multiplicacion.getNumeroUno()) + "  *  " + String.valueOf(multiplicacion.getNumeroDos()) + "  =  "
                                                  + String.valueOf(multiplicacion.metodoMultiplicacion (multiplicacion.getNumeroUno(), 
                                                        multiplicacion.getNumeroDos()))
                                                  + "\n \n El Resultado es :  "
                                                  + String.valueOf(multiplicacion.metodoMultiplicacion(multiplicacion.getNumeroUno(), 
                                                        multiplicacion.getNumeroDos())),
                                                  " MULTIPLICACIÓN ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                    
                case 4:
                    division.setNumeroUno(Double.parseDouble(JOptionPane.showInputDialog(
                            null," Ingrese el primer valor ", " DIVISIÓN ", JOptionPane.PLAIN_MESSAGE)));
                    division.setNumeroDos(Double.parseDouble(JOptionPane.showInputDialog(
                            null," Ingrese el segundo valor ", " DIVISIÓN ", JOptionPane.PLAIN_MESSAGE)));
                    
                    if (division.getNumeroDos() != 0)
                        JOptionPane.showMessageDialog(null, " DIVISIÓN : \n "
                                                      + String.valueOf(division.getNumeroUno()) + "  ÷  " + String.valueOf(division.getNumeroDos()) + "  =  "
                                                      + String.valueOf(division.metodoDivision(division.getNumeroUno(), 
                                                            division.getNumeroDos()))
                                                      + "\n \n El Resultado es :  "
                                                      + String.valueOf(division.metodoDivision(division.getNumeroUno(), 
                                                            division.getNumeroDos())),
                                                      " DIVISIÓN ", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                    else
                        JOptionPane.showMessageDialog(null," ¡ No se puede dividir entre cero (0) ! " , " ERROR ", JOptionPane.ERROR_MESSAGE); 
                    break;
                    
                    
                case 5:
                    int decisionSalir;
                    
                    decisionSalir = JOptionPane.showConfirmDialog(null, " ¿ Seguro que desea Salir ? ", " SALIR ", 
                            JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);   
                    
                    salir.opcionSalida(decisionSalir);
                    break;       
                    
                    
                default:
                    JOptionPane.showMessageDialog(null," ¡ La opción seleccionada no es Válida ! " , " ERROR ", JOptionPane.ERROR_MESSAGE);
                    break;
                      
            }
            
       }    while(retornar == 1);
         
    }
 
}
