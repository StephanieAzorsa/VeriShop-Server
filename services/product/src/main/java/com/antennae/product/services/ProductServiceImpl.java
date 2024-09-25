package com.antennae.product.services;

import com.antennae.product.domain.Product;
import com.antennae.product.dto.request.ProductRequest;
import com.antennae.product.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product save(ProductRequest request) {
        Product product = new Product();

        product.setIdStore(request.idStore());
        product.setName(request.name());
        product.setDescription(request.description());
        product.setPrice(request.price());
        product.setAvailability(request.availability());
        product.setIdSubcategory(request.idSubcategory());
        product.setStatus(true);

        return productRepository
                .save(product);
    }
}
