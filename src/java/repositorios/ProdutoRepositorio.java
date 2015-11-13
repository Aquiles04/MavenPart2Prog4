/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import java.util.List;
import modelos.Produto;

/**
 *
 * @author alexandre.chaves
 */
public interface ProdutoRepositorio {
    
    public List<Produto> obterTodos();
    
    public Produto obterPorId(Long id);
    
}
