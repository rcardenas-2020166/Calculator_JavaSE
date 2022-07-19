
package org.rodrigocardenas.bean;

import javax.swing.JOptionPane;

public class Salir 
{
    
    public Salir()
    {
        
    }

    public void opcionSalida(int decisionSalir)
    { 
        if (decisionSalir == 0)
        {
            JOptionPane.showMessageDialog(null, " Nos vemos Vuelva Pronto ! ",
                    " SALIR ", JOptionPane.INFORMATION_MESSAGE );
            System.exit(0);
        }    
    }
   
}
