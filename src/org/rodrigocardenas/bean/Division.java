
package org.rodrigocardenas.bean;

public class Division 
{
    
    private double numeroUno;
    private double numeroDos;
    
    public Division()
    {
        
    }

    public Division(double numeroUno, double numeroDos) 
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
    
    public double metodoDivision(double numeroUno, double numeroDos)
    {
        double resultadoDivision = numeroUno / numeroDos;
        return resultadoDivision;
    }
    
}
