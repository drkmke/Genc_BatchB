package com.cognizant.stockExchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.stockExchange.model.StockEntity;

public interface StockRepository extends JpaRepository<StockEntity, Integer>{

}
