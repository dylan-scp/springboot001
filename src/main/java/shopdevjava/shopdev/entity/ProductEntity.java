package shopdevjava.shopdev.entity;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductEntity {
  private String name;
  private double price;
  private BigDecimal discount;
}
