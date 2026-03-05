package shopdevjava.shopdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopdevjava.shopdev.entity.ProductEntity;
import shopdevjava.shopdev.repository.ProductRepository;
import shopdevjava.shopdev.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public ProductEntity save() {
    ProductEntity product = productRepository.getById(1);
    return productRepository.save(product);
  }

  @Override
  public List<ProductEntity> getAll() {
    return productRepository.getAll()  ;
  }
  
}
