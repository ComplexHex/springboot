package ru.complex.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.complex.springboot.services.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsControllers {
    private ItemsService itemsService;

    @Autowired
    public void setItemsService(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public String showItemsPage(Model model) {
        model.addAttribute("items", itemsService.getAllItems());
        return "items";
    }

}
