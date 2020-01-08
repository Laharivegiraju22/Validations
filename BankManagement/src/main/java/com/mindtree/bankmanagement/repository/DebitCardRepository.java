package com.mindtree.bankmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.bankmanagement.entity.DebitCard;

public interface DebitCardRepository extends JpaRepository<DebitCard, Integer> {

}
