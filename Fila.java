import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList();

        carros.add("bmw");
        carros.add("porsche");
        carros.add("toro");
        carros.add("Fiat");

        System.out.println(" Topo da fila: " + carros.peek());
        System.out.println(carros);
        System.out.println("Se o carro que for tirado for:" + carros.poll());
        System.out.println("O carro que estará no topo da fila sará: " + carros.peek());
        System.out.println(carros.isEmpty() ? "A fila está vazia" : " A fila tem carros");


    }
}