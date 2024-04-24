import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack <String> carros = new Stack<>();

        carros.push("bmw");
        carros.push("porsche");
        carros.push("toro");
        carros.push("Fiat");

        System.out.println(" Topo da pilha: " + carros.pop());
        System.out.println("Topo:" + carros.peek());
        System.out.println(carros.isEmpty()? "vazia" : "tem carros");


    }
}