package shopdevjava.shopdev.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import shopdevjava.shopdev.entity.ProductEntity;

@Repository
public interface ProductRepository {
  ProductEntity getById(int id);
  ProductEntity save(ProductEntity product);
  List<ProductEntity> getAll();
}
