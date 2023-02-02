package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.lead;

public interface leadrepository extends JpaRepository<lead, Long>
{

}
