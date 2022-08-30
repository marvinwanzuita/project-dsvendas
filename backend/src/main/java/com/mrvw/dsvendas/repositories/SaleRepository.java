package com.mrvw.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrvw.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
