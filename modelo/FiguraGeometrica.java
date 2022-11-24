package modelo;

public abstract class FiguraGeometrica
{
    public abstract double calcularArea();

    public String toString()
    {
        return "Área=" + calcularArea();
    }
}