package uno;

import java.util.List;

public class Comanda {

    private List<Bebida> bebidas;
    private Double precioFinal;


    public Comanda(List<Bebida> bebidas) {
        this.bebidas = bebidas;
        this.precioFinal = calcularPrecioTotal(bebidas);
    }


    private Double calcularPrecioTotal(List<Bebida> bebidas) {
        Double resultado = 0.0d;

        for (Bebida bebida : bebidas) {
            resultado = bebida.getPrecio()+calcularExtra(bebida) + resultado ;
        }
        return resultado;
    }


    private Double calcularExtra(Bebida bebida) {
        Double result = 0.0d;
        if(bebida.getTipobebida().equals(TipoBebida.CALIENTE)) {
            result = 100d;
        }else {
            result = 200d;
        }
        return result;
    }


    public List<Bebida> getBebidas() {
        return bebidas;
    }


    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }


    public Double getPrecioFinal() {
        return precioFinal;
    }


    public void setPrecioFinal(Double precioFinal) {
        this.precioFinal = precioFinal;
    }




}
