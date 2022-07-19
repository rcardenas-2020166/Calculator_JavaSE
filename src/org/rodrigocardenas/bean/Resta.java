
package org.rodrigocardenas.bean;

public class Resta 
{
    
    private double numeroUno;
    private double numeroDos;
    
    public Resta()
    {
        
    }

    public Resta(double numeroUno, double numeroDos) 
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
    
    public double metodoResta(double numeroUno, double numeroDos)
    {
        double resultadoResta = numeroUno - numeroDos;
        return resultadoResta;
    }
    
}
