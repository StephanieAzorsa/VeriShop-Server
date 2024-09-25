package com.antennae.product.controllers;

import com.antennae.product.dto.request.ProductRequest;
import com.antennae.product.dto.response.ProductResponse;
import com.antennae.product.mappers.ProductMapper;
import com.antennae.product.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
@RestController
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok(
                productMapper.toProductResponse(productService.save(productRequest))
        );
    }
}
