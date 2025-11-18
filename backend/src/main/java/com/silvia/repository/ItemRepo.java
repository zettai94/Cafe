package com.silvia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.silvia.entity.Item;

public interface ItemRepo extends JpaRepository<Item, Long>{
    
}
