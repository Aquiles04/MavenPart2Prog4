package controladores;


import java.util.List;
import modelos.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repositorios.ProdutoRepositorio;

/**
 *
 * @author alexandre.chaves
 */
@Controller
public class ProdutoController {
   
    @Autowired
    private ProdutoRepositorio repositorio;
    
   @RequestMapping("/produto/listar")
   public ModelAndView listarProdutos(){
       
       ModelAndView mv;
       mv = new ModelAndView("produto-listar");
       List<Produto> produtos;
       produtos = repositorio.obterTodos();
       mv.addObject("produtos", produtos);
       
       return mv;
       
   }
   
   @RequestMapping("/produto/{id}")
   public ModelAndView detalheProduto(@PathVariable("id") long id){
       
       Produto produto;
       produto = repositorio.obterPorId(id);
       
       ModelAndView mv;
       mv = new ModelAndView("produto-detalhe");
       mv.addObject("produto", produto);
       
       
       return mv;
       
   }
    
    
}
