package com.springboot.mongodb.controller;


import com.springboot.mongodb.model.GroceryItem;
import com.springboot.mongodb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class GroceryController {

    @Autowired
    ItemRepository itemRepository;

    // code to enable swaggger ui
    // @ApiIgnore - to ignore ready made request api
    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/items")
    public List<GroceryItem> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping("/item")
    public GroceryItem addItem(@RequestBody GroceryItem item) {
        return itemRepository.save(item);
    }

}
