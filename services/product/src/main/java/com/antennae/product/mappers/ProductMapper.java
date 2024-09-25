package com.antennae.product.mappers;

import com.antennae.product.domain.Product;
import com.antennae.product.dto.response.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
                product.getIdProduct(),
                product.getIdStore(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.isAvailability(),
                product.getIdSubcategory(),
                product.getIdImages(),
                product.isStatus(),
                product.getCreatedAt(),
                product.getUpdatedAt()
        );
    }
}
