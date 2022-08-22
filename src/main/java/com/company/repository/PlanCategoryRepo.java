package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.PlanCategory;

public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer> {

}
