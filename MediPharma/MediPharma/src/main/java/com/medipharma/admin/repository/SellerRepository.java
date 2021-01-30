package com.medipharma.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medipharma.admin.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {
	public List <Seller> findBysellerName(String seller);
}
