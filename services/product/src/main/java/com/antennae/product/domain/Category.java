package com.antennae.product.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Builder
@Getter
@Setter
@Document(collection = "category")
public class Category {
    @Id
    private String idCategory;

    private String name;
}
