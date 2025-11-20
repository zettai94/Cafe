package com.silvia.exceptions;

public class ItemIDNotFoundException extends RuntimeException{
    public ItemIDNotFoundException(Long id){
        super("Item ID not found: " + id);
    }
}