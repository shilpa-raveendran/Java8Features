package com.shilpa.CodingQuestions;

import java.util.List;

public class Orders {
    private List<Item> itemsList;
    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }
    public Orders() {

    }

    public Orders(List<Item> itemsList) {
        this.itemsList = itemsList;
    }
}
