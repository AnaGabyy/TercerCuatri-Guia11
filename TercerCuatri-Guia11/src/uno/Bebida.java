package uno;

public abstract class Bebida {

    private TipoBebida tipobebida;
    private Double precio;

    public Bebida(TipoBebida tipoBebida, Double precio) {
        this.precio = precio;
        this.tipobebida = tipoBebida;
    }

    public TipoBebida getTipobebida() {
        return tipobebida;
    }
    public void setTipobebida(TipoBebida tipobebida) {
        this.tipobebida = tipobebida;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
