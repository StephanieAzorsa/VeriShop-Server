package com.antennae.product.services;

import com.antennae.product.domain.Product;
import com.antennae.product.dto.request.ProductRequest;

public interface ProductService {
    Product save(ProductRequest request);
}
