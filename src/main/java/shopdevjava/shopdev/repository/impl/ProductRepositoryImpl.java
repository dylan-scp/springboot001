package shopdevjava.shopdev.repository.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import shopdevjava.shopdev.entity.ProductEntity;
import shopdevjava.shopdev.repository.ProductRepository;

@Repository
class ProductRepositoryImpl implements ProductRepository {

    @Override
    public ProductEntity getById(int id) {
      if(id == 1) {
        ProductEntity product = new ProductEntity();
        product.setName("Test");
        product.setPrice(100);
        product.setDiscount(BigDecimal.valueOf(0.1));
        return product;
      }
      return null;
    }

    @Override
    public ProductEntity save(ProductEntity product) {
        return product;
    }

    @Override
    public List<ProductEntity> getAll() {
        ProductEntity product = new ProductEntity();
        product.setName("Test01");
        product.setPrice(1000);
        product.setDiscount(BigDecimal.valueOf(0.1));
        return List.of(product);
    }
  
}