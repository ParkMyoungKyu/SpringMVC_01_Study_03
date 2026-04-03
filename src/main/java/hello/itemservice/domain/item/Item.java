package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantitiy;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantitiy) {
        this.quantitiy = quantitiy;
        this.price = price;
        this.itemName = itemName;
    }
}
