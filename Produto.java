import java.util.Observable;

public class Produto extends Observable {
    private String nome;
    private double preco;
    private boolean disponivel;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = false;
    }

    public void reporEstoque() {
        this.disponivel = true;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                '}';
    }
}