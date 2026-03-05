package shopdevjava.shopdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shopdevjava.shopdev.service.ProductService;

@RestController
@RequestMapping("/v1/api")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/products")
  public Object getProducts() {
    return productService.getAll();
  }

  @PostMapping("/products")
  public Object save() {
    return productService.save();
  }
}
