package com.learning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learning.entities.Category;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> { }
