package com.antennae.product.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public record ProductResponse(
        String idProduct,
        String idStore,
        String name,
        String description,
        double price,
        boolean availability,
        String idSubcategory,
        List<String>idImages,
        boolean status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
