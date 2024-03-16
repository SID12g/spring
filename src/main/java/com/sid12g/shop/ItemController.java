package com.sid12g.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;


    @GetMapping("/list")
    String list(Model model){
        List<Item> result = itemRepository.findAll();
//        System.out.println(result.get(0).price);
        model.addAttribute("items", result);

        var a = new Item();
        System.out.println(a.toString());
        return "list.html";
    }

}
