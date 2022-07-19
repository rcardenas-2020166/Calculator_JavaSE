
package org.rodrigocardenas.bean;

public class Multiplicacion 
{
    
    private double numeroUno;
    private double numeroDos;
    
    public Multiplicacion()
    {
        
    }

    public Multiplicacion(double numeroUno, double numeroDos) 
    {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public double getNumeroUno() 
    {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) 
    {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() 
    {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) 
    {
        this.numeroDos = numeroDos;
    }
    
    public double metodoMultiplicacion(double numeroUno, double numeroDos)
    {
        double resultadoMultiplicacion = numeroUno * numeroDos;
        return resultadoMultiplicacion;
    }
    
}
