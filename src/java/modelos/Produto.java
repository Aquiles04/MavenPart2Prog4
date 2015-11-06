
package modelos;

/**
 *
 * @author alexandre.chaves
 */
public class Produto {
    
    private long id;
    private String nome;
    private float quantidade;
    private float precoUnitario;
     
     
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float PrecoUnitario) {
        this.precoUnitario = precoUnitario;
    }
   
    
}
