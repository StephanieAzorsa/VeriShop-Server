package com.antennae.product.repositories;

import com.antennae.product.domain.Subcategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoryRepository extends MongoRepository<Subcategory, String> {
}
