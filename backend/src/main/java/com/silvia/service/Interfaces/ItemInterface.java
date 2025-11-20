package com.silvia.service.interfaces;

public interface ItemInterface{
    /*  general usage:
        * get by itemID
        * get by category
        * get by name
        * view all
    */ 
    public Item getItemById(Long id);
    public List <Item> getItemsByCategory(String category);
    public List <Item> getItemsByName(String name);
    public List <Item> getAllItems();


    /* specifically admin usage:
        * add new item
        * update item
        * delete item
    */
    public Item addNewItem(Item item);
    public Item updateItem(Long id, Item item); 
    public void deleteItem(Long id);
    
}