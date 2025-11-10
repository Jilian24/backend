package com.app.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.backend.model.SubCategory;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubcategoryRepository extends JpaRepository<SubCategory, Long> {
    
    List<Subcategory> findByCategoryId(Long categoryId);

}