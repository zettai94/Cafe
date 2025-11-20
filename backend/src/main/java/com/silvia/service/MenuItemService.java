package com.silvia.service;

import com.silvia.entity.Item;
import com.silvia.repository.ItemRepo;
import com.silvia.service.interfaces.ItemInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MenuItemService implements ItemInterface{

    private final ItemRepo itemRepo;

    @Autowired
    public ItemService(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    public Optional<Item> getItemById(Long id)
    {
        return itemRepo.findByItemID(id);
    }

    public List<Item> getItemsByCategory(String category)
    {
        return itemRepo.findAllByCategory(category);
    }

    //search bar usage
    public List<Item> getItemsByName(String name)
    {
        return itemRepo.findByItemNameContainingIgnoreCase(name);
    }

    public List<Item> getAllItems()
    {
        return itemRepo.findAll();
    }

    public Optional<Item> addOrReturnItem(Item newItem)
    {
        Optional<Item> existingItem = itemRepo.findByItemName(newItem.getItemName());
        if(existingItem.isPresent())
        {
            return existingItem;
            //to be handled in Controller 
        }
        Item savedItem = itemRepo.save(newItem);
        return Optional.of(savedItem);
    }

    public Item updateItem(Long id, Item item)
    {
        Item exisitng = itemRepo.findById(id).orElseThrow(()-> new ItemIDNotFoundException(id));
        exisitng.setCategory(item.getCategory());
        exisitng.setItemName(item.getItemName());
        exisitng.setItemPrice(item.getItemPrice());
        return itemRepo.save(exisitng);
    }

    public void deleteItem(Long id)
    {
        itemRepo.deleteById(id);
    }

}