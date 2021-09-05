package ru.complex.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.complex.springboot.entities.Item;
import ru.complex.springboot.repositories.ItemRepository;


import java.util.List;

@Service
public class ItemsService {
    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public long findAll(){
        return itemRepository.count();
    }
}
