package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD

@RestController
public class ProductResource {
  private Product produto;

  public ProductResource() {
    this.produto = new Product();
    produto.setValor(25.00);
  }

  @RequestMapping(value = "/produtos", 
  method = RequestMethod.GET)
  public Product buscarProdutos() {
    return produto;
    // return "Greetings from Spring Boot!";
  }

}
=======
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductResource {
    private Product produto;

    public ProductResource(){
        this.produto = new Product();
        produto.setValor(25.00);
}
@RequestMapping(value="/produtos", method=RequestMethod.GET)
public Product buscarProdutos() {
   return produto;
   //return "Greetings from Spring Boot!";
    }

}
>>>>>>> commit on master
