package hello.itemservice.domain.item.basic;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/basic/items")
@RequiredArgsConstructor
public class BasicItemController {
    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model) {
        List<Item> items = itemRepository.findALl();
        model.addAttribute("items", items);
        return "basic/items";
    }

    /**
     * TEST 용 데이터
     */
    @PostConstruct
    public void init(){
        itemRepository.save(new Item("ITEM01",10000,100));
        itemRepository.save(new Item("ITEM02",20000,200));
        itemRepository.save(new Item("ITEM03",30000,300));
    }
}
