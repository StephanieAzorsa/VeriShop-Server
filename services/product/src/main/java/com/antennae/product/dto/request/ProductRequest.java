package com.antennae.product.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;

public record ProductRequest(
        @NotNull(message = "Tienda del producto es requerida")
        String idStore,

        @NotNull(message = "Nombre del producto es requerido")
        String name,

        @NotNull(message = "Descripción del producto es requerido")
        String description,

        @Positive(message = "Precio del producto debe ser positivo")
        double price,

        @NotNull(message = "Disponibilidad del producto es requerido")
        boolean availability,

        @NotNull(message = "Subcategoría del producto es requerida")
        String idSubcategory,

        List<String>idImages
) {
}
