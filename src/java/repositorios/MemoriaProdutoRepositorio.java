/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import java.util.List;
import modelos.Produto;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alexandre.chaves
 */

@Repository
public class MemoriaProdutoRepositorio implements ProdutoRepositorio{
    
    
    private static List<Produto> produtos = new ArrayList<Produto>();
    
    
    static
    {
        
        produtos.add(new Produto());
        produtos.get(0).setId(1L);
        produtos.get(0).setNome("Iphone");
        produtos.get(0).setPrecoUnitario((float) 9999.99);
        
        produtos.add(new Produto());
        produtos.get(1).setId(2L);
        produtos.get(1).setNome("Samsung Galaxy");
        produtos.get(1).setPrecoUnitario((float) 899.99);
        
        produtos.add(new Produto());
        produtos.get(2).setId(2L);
        produtos.get(2).setNome("Moto G");
        produtos.get(2).setPrecoUnitario((float) 699.99);
        
    }
        
    
    @Override
    public List<Produto> obterTodos(){
        return produtos;
    }
    
    @Override
    public Produto obterPorId(long id){
        
        Produto produto;
        produto = produtos.stream()
                            .filter(p -> p.getId() == id)
                            .findFirst()
                            .get();
        return produto;
                            
        
    }
}
