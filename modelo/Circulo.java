package modelo;

public class Circulo extends FiguraGeometrica
{
    private int radio;

    public Circulo(int r)
    {
        radio = r;
    }

    public void setRadio(int r)
    {
        this.radio = r;
    }

    public int getRadio()
    {
        return radio;
    }

    public double calcularArea()
    {
        return Math.PI*Math.pow(radio,2);
    }
}
