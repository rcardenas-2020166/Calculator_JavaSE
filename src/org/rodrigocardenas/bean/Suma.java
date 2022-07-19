
package org.rodrigocardenas.bean;

public class Suma 
{
    
    private double numeroUno;
    private double numeroDos;
    
    public Suma()
    {
        
    }

    public Suma(double numeroUno, double numeroDos) 
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
    
    public double metodoSuma(double numeroUno, double numeroDos)
    {
        double resultadoSuma = numeroUno + numeroDos;
        return resultadoSuma;
    }
    
}
