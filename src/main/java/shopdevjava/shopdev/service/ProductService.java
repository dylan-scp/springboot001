package shopdevjava.shopdev.service;

import java.util.List;

import org.springframework.stereotype.Service;

import shopdevjava.shopdev.entity.ProductEntity;

@Service
public interface ProductService {
  ProductEntity save();
  List<ProductEntity> getAll();
}
