package com.silvia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.silvia.entity.Inventory;

public interface IventoryRepo extends JpaRepository<Inventory, Long>{
    
}
