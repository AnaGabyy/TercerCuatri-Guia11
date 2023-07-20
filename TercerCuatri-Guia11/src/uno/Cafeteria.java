package uno;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {

    private List<Comanda> pedidosEntrantesPorLista;
    private List<Comanda> pedidosSalientesPorLista;


    public Cafeteria() {
        this.pedidosEntrantesPorLista = new ArrayList<>();
        this.pedidosSalientesPorLista = new ArrayList<>();
    }

    public Integer ingresarPedidoPorLista(Comanda comanda) {
        this.pedidosEntrantesPorLista.add(comanda);
        return this.pedidosEntrantesPorLista.size();
    }
    public void sacarPedidoPorLista(Integer numeroComanda) {
        Comanda comandaSaliente = null;
        if(numeroComanda == 1 && this.pedidosEntrantesPorLista.size() == 1) {
            comandaSaliente = this.pedidosEntrantesPorLista.get(0);
        }else {
            comandaSaliente = this.pedidosEntrantesPorLista.get(numeroComanda);
        }

        this.pedidosEntrantesPorLista.remove(comandaSaliente);
        this.pedidosSalientesPorLista.add(comandaSaliente);
    }

    public void mostrarTotalPedidosIngresados() {
        System.out.println("Los pedidos totales ingresados fueron " +this.pedidosSalientesPorLista.size());
    }

    public void totalPorPedidos() {
        for (Comanda comanda : pedidosEntrantesPorLista) {
            System.out.println("El total de la comanda fue " + comanda.getPrecioFinal());
        }
    }

    public void totalAcumuladoDePedidos() {
        Double result = 0.0d;
        for (Comanda comanda : pedidosEntrantesPorLista) {
            result = result + comanda.getPrecioFinal();
        }
        System.out.println("El total acumulado de todos los pedidos es " + result);
    }



}
