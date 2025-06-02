import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveNotificarClienteSobreDisponibilidade() {
        Produto celular = new Produto("Smartphone X", 1999.99);
        Cliente cliente = new Cliente("João");
        cliente.interesseProduto(celular);
        celular.reporEstoque();
        assertEquals("João, o produto Produto{nome='Smartphone X', preco=1999.99, disponivel=true} está disponível!", 
            cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarVariosClientes() {
        Produto notebook = new Produto("Notebook Y", 3999.99);
        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("Pedro");
        
        cliente1.interesseProduto(notebook);
        cliente2.interesseProduto(notebook);
        
        notebook.reporEstoque();
        
        assertEquals("Maria, o produto Produto{nome='Notebook Y', preco=3999.99, disponivel=true} está disponível!", 
            cliente1.getUltimaNotificacao());
        assertEquals("Pedro, o produto Produto{nome='Notebook Y', preco=3999.99, disponivel=true} está disponível!", 
            cliente2.getUltimaNotificacao());
    }
}